package com.magneticmediadatabase.bcs.infraestructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "usuarios")
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuarios", nullable = false)
    private Integer id;


    @Column(name = "primer_nombre", nullable = false, length = 15)
    private String primerNombre;


    @Column(name = "segundo_nombre", length = 15)
    private String segundoNombre;


    @Column(name = "primer_apellido", nullable = false, length = 15)
    private String primerApellido;

    @Column(name = "segundo_apellido", nullable = false, length = 15)
    private String segundoApellido;

}