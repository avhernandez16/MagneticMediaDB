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
@Table(name = "proveedores")
public class ProveedoreEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProveedor", nullable = false)
    private Integer id;

    @Size(max = 20)
    @NotNull
    @Column(name = "nombre_proveedores", nullable = false, length = 20)
    private String nombreProveedores;

    @OneToMany(mappedBy = "fkProveedor")
    private Set<InventarioEntity> inventarios = new LinkedHashSet<>();

}