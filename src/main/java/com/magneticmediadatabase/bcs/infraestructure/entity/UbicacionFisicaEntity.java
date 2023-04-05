package com.magneticmediadatabase.bcs.infraestructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ubicacion_fisica")
public class UbicacionFisicaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUbicacion", nullable = false)
    private Integer id;


    @Column(name = "ubicacion", nullable = false, length = 20)
    private String ubicacion;

}