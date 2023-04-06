package com.magneticmediadatabase.bcs.infraestructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tipo_transporte")
public class TipoTransporteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTipo_transporte", nullable = false)
    private Integer id;


    @Column(name = "nombre_tipo_transporte", nullable = false, length = 20)
    private String nombreTipoTransporte;

}
