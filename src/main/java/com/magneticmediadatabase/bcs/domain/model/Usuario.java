package com.magneticmediadatabase.bcs.domain.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Integer id;
    private final String primerNombre;
    private final String segundoNombre;
    private final String primerApellido;
    private final String segundoApellido;

    public Usuario(Integer id, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido) {
        this.id = id;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }
}

