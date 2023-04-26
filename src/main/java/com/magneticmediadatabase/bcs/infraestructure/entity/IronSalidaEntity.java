package com.magneticmediadatabase.bcs.infraestructure.entity;

import com.magneticmediadatabase.bcs.domain.model.IronSalida;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

//Long id,
//        LocalDate fecha_salida,
//        LocalDate fecha_devolucion,
//        String usuario,
//        String ubicacion,
//        String tipo_transporte,
//        Long numero_remision,
//        Long codigo
@Getter
@Setter
@Entity
@Table(name = "iron_salida")
@NoArgsConstructor
public class IronSalidaEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idironSalida", nullable = false)
    private Long id;

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

    public IronSalidaEntity(Long id, LocalDate fechaSalida, LocalDate fechaDevolucion, TipoTransporteEntity fkTipoTransporte, MedioEntity fkMedio, UsuarioEntity fkUsuarios, UbicacionFisicaEntity fkUbicacion) {
        this.id = id;
        this.fechaSalida = fechaSalida;
        this.fechaDevolucion = fechaDevolucion;
        this.fkTipoTransporte = fkTipoTransporte;
        this.fkMedio = fkMedio;
        this.fkUsuarios = fkUsuarios;
        this.fkUbicacion = fkUbicacion;
    }

    public IronSalida toDomainModel() {
        return new IronSalida(id, fechaSalida, fechaDevolucion, fkTipoTransporte, fkMedio, fkUsuarios, fkUbicacion);
    }

    public static IronSalidaEntity fromDomainModel (IronSalida ironSalida){
        return new IronSalidaEntity(
                ironSalida.getId(),
                ironSalida.getFecha_salida(),
                ironSalida.getFecha_devolucion(),
                ironSalida.getTipoTransporteEntity(),
                ironSalida.getMedioEntity(),
                ironSalida.getUsuarioEntity(),
                ironSalida.getUbicacionFisicaEntity()
        );
    }


}