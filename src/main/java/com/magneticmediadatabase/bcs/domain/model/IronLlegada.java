package com.magneticmediadatabase.bcs.domain.model;

import com.magneticmediadatabase.bcs.infraestructure.entity.MedioEntity;
import com.magneticmediadatabase.bcs.infraestructure.entity.TipoTransporteEntity;
import com.magneticmediadatabase.bcs.infraestructure.entity.UbicacionFisicaEntity;
import com.magneticmediadatabase.bcs.infraestructure.entity.UsuarioEntity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class IronLlegada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numeroRemision;
    private LocalDate dateCreated;
    private Usuario usuario;
    private UsuarioEntity usuarioEntity;
    private UbicacionFisica ubicacionFisica;
    private UbicacionFisicaEntity ubicacionFisicaEntity;
    private TipoTransporte tipoTransporte;
    private TipoTransporteEntity tipoTransporteEntity;
    private Medio medio;
    private MedioEntity medioEntity;



    public IronLlegada(Long id, String numeroRemision, LocalDate dateCreated, Usuario usuario, UbicacionFisica ubicacionFisica, TipoTransporte tipoTransporte, Medio medio) {
        this.id = id;
        this.numeroRemision = numeroRemision;
        this.dateCreated = dateCreated.now();
        this.usuario = usuario;
        this.ubicacionFisica = ubicacionFisica;
        this.tipoTransporte = tipoTransporte;
        this.medio = medio;
    }

    public IronLlegada(Long id, String numeroRemision, LocalDate dateCreated, UsuarioEntity usuarioEntity, UbicacionFisicaEntity ubicacionFisicaEntity, TipoTransporteEntity tipoTransporteEntity, MedioEntity medioEntity) {
        this.id = id;
        this.numeroRemision = numeroRemision;
        this.dateCreated = dateCreated.now();
        this.usuarioEntity = usuarioEntity;
        this.ubicacionFisicaEntity = ubicacionFisicaEntity;
        this.tipoTransporteEntity = tipoTransporteEntity;
        this.medioEntity = medioEntity;
    }

    public IronLlegada() {
    }
}
