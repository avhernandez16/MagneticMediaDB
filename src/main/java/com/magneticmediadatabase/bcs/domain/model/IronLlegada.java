package com.magneticmediadatabase.bcs.domain.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class IronLlegada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numeroRemision;
    private LocalDate dateCreated;

    public IronLlegada(Long id, String numeroRemision, LocalDate dateCreated) {
        this.id = id;
        this.numeroRemision = numeroRemision;
        this.dateCreated = dateCreated.now();
    }
}
