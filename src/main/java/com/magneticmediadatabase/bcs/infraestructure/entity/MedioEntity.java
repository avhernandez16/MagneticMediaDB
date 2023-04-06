package com.magneticmediadatabase.bcs.infraestructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "medio")
public class MedioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMedio", nullable = false)
    private Integer id;


    @Column(name = "codigo_cinta", nullable = false, length = 8)
    private String codigoCinta;

}
