package com.magneticmediadatabase.bcs.infraestructure.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "programa")
public class ProgramaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPrograma", nullable = false)
    private Integer id;

    @Size(max = 20)
    @NotNull
    @Column(name = "Nombre_programa", nullable = false, length = 20)
    private String nombrePrograma;

    @OneToMany(mappedBy = "fkPrograma")
    private Set<CatalogoEntity> catalogos = new LinkedHashSet<>();

}