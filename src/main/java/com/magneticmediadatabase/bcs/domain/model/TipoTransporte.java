package com.magneticmediadatabase.bcs.domain.model;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Data
public class TipoTransporte{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Integer id;
    private final String nombreTipoTransporte;

    public TipoTransporte(Integer id, String nombreTipoTransporte) {
        this.id = id;
        this.nombreTipoTransporte = nombreTipoTransporte;
    }
}
