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
@Table(name = "consola")
public class ConsolaEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idConsola", nullable = false)
    private Integer id;

    @Size(max = 20)
    @NotNull
    @Column(name = "Consola", nullable = false, length = 20)
    private String consola;

    @OneToMany(mappedBy = "fkConsola")
    private Set<CatalogoEntity> catalogos = new LinkedHashSet<>();

}