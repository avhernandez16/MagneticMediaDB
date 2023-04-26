package com.magneticmediadatabase.bcs.domain.model;


import com.magneticmediadatabase.bcs.infraestructure.entity.MedioEntity;
import com.magneticmediadatabase.bcs.infraestructure.entity.TipoTransporteEntity;
import com.magneticmediadatabase.bcs.infraestructure.entity.UbicacionFisicaEntity;
import com.magneticmediadatabase.bcs.infraestructure.entity.UsuarioEntity;
import lombok.Data;

import java.time.LocalDate;

@Data
public class IronSalida {
    private Long id;
    private LocalDate fecha_salida;
    private LocalDate fecha_devolucion;
    private TipoTransporte tipoTransporte;
    private TipoTransporteEntity tipoTransporteEntity;
    private Medio medio;
    private MedioEntity medioEntity;
    private Usuario usuario;
    private UsuarioEntity usuarioEntity;
    private UbicacionFisica ubicacionFisica;
    private UbicacionFisicaEntity ubicacionFisicaEntity;


    public IronSalida(Long id, LocalDate fecha_salida, LocalDate fecha_devolucion, TipoTransporte tipoTransporte, Medio medio, Usuario usuario, UbicacionFisica ubicacionFisica) {
        this.id = id;
        this.fecha_salida = fecha_salida;
        this.fecha_devolucion = fecha_devolucion;
        this.tipoTransporte = tipoTransporte;
        this.medio = medio;
        this.usuario = usuario;
        this.ubicacionFisica = ubicacionFisica;
    }

    public IronSalida(Long id, LocalDate fecha_salida, LocalDate fecha_devolucion, TipoTransporteEntity tipoTransporteEntity, MedioEntity medioEntity, UsuarioEntity usuarioEntity, UbicacionFisicaEntity ubicacionFisicaEntity) {
        this.id = id;
        this.fecha_salida = fecha_salida;
        this.fecha_devolucion = fecha_devolucion;
        this.tipoTransporteEntity = tipoTransporteEntity;
        this.medioEntity = medioEntity;
        this.usuarioEntity = usuarioEntity;
        this.ubicacionFisicaEntity = ubicacionFisicaEntity;
    }

    public IronSalida() {
    }
}
