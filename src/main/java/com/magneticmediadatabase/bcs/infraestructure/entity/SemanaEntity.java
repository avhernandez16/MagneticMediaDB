package com.magneticmediadatabase.bcs.infraestructure.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "semanas")
public class SemanaEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSemanas", nullable = false)
    private Integer id;

    @Size(max = 20)
    @NotNull
    @Column(name = "Semanas", nullable = false, length = 20)
    private String semanas;

    @OneToMany(mappedBy = "idSemanas")
    private Set<CicloCatalogoEntity> cicloCatalogos = new LinkedHashSet<>();

}