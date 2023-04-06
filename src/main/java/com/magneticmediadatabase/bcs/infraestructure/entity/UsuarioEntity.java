package com.magneticmediadatabase.bcs.infraestructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Entity
@Table(name = "usuarios")
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuarios", nullable = false)
    private Integer id;

    @NotBlank(message = "El primer nombre no debe estar en blanco")
    @Column(name = "primer_nombre", nullable = false, length = 15)
    private String primerNombre;


    @Column(name = "segundo_nombre", length = 15)
    private String segundoNombre;

    @NotBlank(message = "El primer apellido no debe estar en blanco")
    @Column(name = "primer_apellido", nullable = false, length = 15)
    private String primerApellido;

    @Column(name = "segundo_apellido", nullable = false, length = 15)
    private String segundoApellido;

}