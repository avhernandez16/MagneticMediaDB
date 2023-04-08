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
@Table(name = "tecnologias")
public class TecnologiaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTecnologias", nullable = false)
    private Integer id;

    @Size(max = 4)
    @NotNull
    @Column(name = "nombre_tecnologias", nullable = false, length = 4)
    private String nombreTecnologias;

    @OneToMany(mappedBy = "fkTecnologias")
    private Set<CatalogoEntity> catalogos = new LinkedHashSet<>();

    @OneToMany(mappedBy = "fkTecnologias")
    private Set<InventarioEntity> inventarios = new LinkedHashSet<>();

}