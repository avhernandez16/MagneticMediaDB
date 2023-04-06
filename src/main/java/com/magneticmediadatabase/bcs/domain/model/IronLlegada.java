package com.magneticmediadatabase.bcs.domain.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class IronLlegada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numeroRemision;
    private LocalDateTime dateCreated;
    private boolean completed;

    public IronLlegada(Long id, int numeroRemision, LocalDateTime dateCreated, boolean completed) {
        this.id = id;
        this.numeroRemision = numeroRemision;
        this.dateCreated = dateCreated;
        this.completed = completed;
    }
}
