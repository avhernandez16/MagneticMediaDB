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
@Table(name = "ciclo_catalogo")
public class CicloCatalogoEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCiclo_catalogo", nullable = false)
    private Integer id;

    @Size(max = 8)
    @NotNull
    @Column(name = "Ciclo_catalogo", nullable = false, length = 8)
    private String cicloCatalogo;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idSemanas", nullable = false)
    private SemanaEntity idSemanas;

    @OneToMany(mappedBy = "fkCicloCatalogo")
    private Set<CatalogoEntity> catalogos = new LinkedHashSet<>();

}