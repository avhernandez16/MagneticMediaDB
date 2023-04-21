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
@Table(name = "ip")
public class IpEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idIP", nullable = false)
    private Integer id;

    @Size(max = 12)
    @NotNull
    @Column(name = "direccion_ip", nullable = false, length = 12)
    private String direccionIp;

    @Size(max = 20)
    @NotNull
    @Column(name = "nombre_servidor", nullable = false, length = 20)
    private String nombreServidor;

    @OneToMany(mappedBy = "fkIp")
    private Set<CatalogoEntity> catalogos = new LinkedHashSet<>();

}