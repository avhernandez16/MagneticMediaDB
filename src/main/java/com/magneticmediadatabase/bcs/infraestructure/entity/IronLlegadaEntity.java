package com.magneticmediadatabase.bcs.infraestructure.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.magneticmediadatabase.bcs.domain.model.IronLlegada;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "iron_llegada")
@NoArgsConstructor
@Data
public class IronLlegadaEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idiron_llegada")
    private Long id;

    @Size(min = 10, max = 20, message = "El numero de remision debe tener minimo 10 caracteres")
    @NotBlank(message = "El numero de remision no debe estar en blanco")
    @Column(name="numero_remision", nullable = false)
    private String numeroRemision;

    @Column(name="fecha_entrada", nullable = false)
    private LocalDate dateCreated;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="fk_Usuarios", nullable = false)
    @JsonIgnoreProperties("listaUsuarios")
    private com.magneticmediadatabase.bcs.infraestructure.entity.UsuarioEntity fkUsuarios;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="fk_Ubicacion", nullable = false)
    @JsonIgnoreProperties("listaUbicacion")
    private com.magneticmediadatabase.bcs.infraestructure.entity.UbicacionFisicaEntity fkUbicacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="fk_Tipo_transporte", nullable = false)
    @JsonIgnoreProperties("listaTransporte")
    private com.magneticmediadatabase.bcs.infraestructure.entity.TipoTransporteEntity fkTipoTransporte;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="fk_Medio", nullable = false)
    @JsonIgnoreProperties("listaMedio")
    private com.magneticmediadatabase.bcs.infraestructure.entity.MedioEntity fkMedio;

    public IronLlegadaEntity(Long id, String numeroRemision, LocalDate dateCreated, UsuarioEntity fkUsuarios, UbicacionFisicaEntity fkUbicacion, TipoTransporteEntity fkTipoTransporte, MedioEntity fkMedio) {
        this.id = id;
        this.numeroRemision = numeroRemision;
        this.dateCreated = dateCreated;
        this.fkUsuarios = fkUsuarios;
        this.fkUbicacion = fkUbicacion;
        this.fkTipoTransporte = fkTipoTransporte;
        this.fkMedio = fkMedio;
    }

    //metodos equivalentes a la clase mapper
    public static IronLlegadaEntity fromDomainModel (IronLlegada ironLlegada){
        return new IronLlegadaEntity(ironLlegada.getId(), ironLlegada.getNumeroRemision(), ironLlegada.getDateCreated(), ironLlegada.getUsuarioEntity(), ironLlegada.getUbicacionFisicaEntity(), ironLlegada.getTipoTransporteEntity(), ironLlegada.getMedioEntity());
    }

    public IronLlegada toDomainModel(){
        return new IronLlegada(id, numeroRemision, dateCreated, fkUsuarios, fkUbicacion, fkTipoTransporte, fkMedio );
    }


}
