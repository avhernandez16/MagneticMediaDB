package com.magneticmediadatabase.bcs.infraestructure.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "iron_salida")
public class IronSalidaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idironSalida", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "fecha_salida", nullable = false)
    private LocalDate fechaSalida;

    @NotNull
    @Column(name = "fecha_devolucion", nullable = false)
    private LocalDate fechaDevolucion;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fk_Tipo_transporte", nullable = false)
    private TipoTransporteEntity fkTipoTransporte;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fk_Medio", nullable = false)
    private MedioEntity fkMedio;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fk_Usuarios", nullable = false)
    private UsuarioEntity fkUsuarios;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fk_Ubicacion", nullable = false)
    private UbicacionFisicaEntity fkUbicacion;

}