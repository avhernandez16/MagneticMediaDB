package com.magneticmediadatabase.bcs.infraestructure.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    @Column(name="idiron_llegada")
    @Size(min = 10, max = 20, message = "El numero de remision debe tener minimo 10 caracteres")
    @NotBlank(message = "El numero de remision no debe estar en blanco")
    private long id;
    @Column(name="fecha_entrada")
    private LocalDateTime dateCreated;


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
}
