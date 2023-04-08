package com.magneticmediadatabase.bcs.infraestructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

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

    @OneToMany(mappedBy = "fkUbicacion")
    private Set<InventarioEntity> inventarios = new LinkedHashSet<>();

    @OneToMany(mappedBy = "fkUbicacion")
    private Set<com.magneticmediadatabase.bcs.infraestructure.entity.MedioEntity> medios = new LinkedHashSet<>();

    @OneToMany(mappedBy = "fkUbicacion")
    private Set<com.magneticmediadatabase.bcs.infraestructure.entity.IronLlegadaEntity> ironLlegadas = new LinkedHashSet<>();

    @OneToMany(mappedBy = "fkUbicacion")
    private Set<com.magneticmediadatabase.bcs.infraestructure.entity.IronSalidaEntity> ironSalidas = new LinkedHashSet<>();

}
