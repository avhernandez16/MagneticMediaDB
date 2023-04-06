package com.magneticmediadatabase.bcs.domain.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class UbicacionFisica{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Integer id;
    private final String ubicacion;

    public UbicacionFisica(Integer id, String ubicacion) {
        this.id = id;
        this.ubicacion = ubicacion;
    }
}

