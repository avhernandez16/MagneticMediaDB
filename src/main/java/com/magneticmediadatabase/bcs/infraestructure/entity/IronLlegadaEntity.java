package com.magneticmediadatabase.bcs.infraestructure.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.magneticmediadatabase.bcs.domain.model.IronLlegada;
import jakarta.persistence.*;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "iron_llegada")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class IronLlegadaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idiron_llegada")
    private Long id;


    @Column(name="numero_remision")
    private int numeroRemision;

    @Column(name="fecha_entrada")
    private LocalDateTime dateCreated;

    private boolean completed;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="fk_Usuarios")
    @JsonIgnoreProperties("listaUsuarios")
    private UsuarioEntity usuarioEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="fk_Ubicacion")
    @JsonIgnoreProperties("listaUbicacion")
    private UbicacionFisicaEntity ubicacionFisicaEntityEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="fk_Tipo_transporte")
    @JsonIgnoreProperties("listaTransporte")
    private TipoTransporteEntity tipoTransporteEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="fk_Medio")
    @JsonIgnoreProperties("listaMedio")
    private MedioEntity medioEntity;

    public IronLlegadaEntity(Long id, int numeroRemision, LocalDateTime dateCreated, boolean completed) {
        this.id = id;
        this.numeroRemision = numeroRemision;
        this.dateCreated = dateCreated;
        this.completed = completed;
    }

    //metodos equivalentes a la clase mapper
    public static IronLlegadaEntity fromDomainModel (IronLlegada ironLlegada){
        return new IronLlegadaEntity(ironLlegada.getId(), ironLlegada.getNumeroRemision(), ironLlegada.getDateCreated(),ironLlegada.isCompleted());
    }

    public IronLlegada toDomainModel(){
        return new IronLlegada(id, numeroRemision, dateCreated,completed);
    }


}
