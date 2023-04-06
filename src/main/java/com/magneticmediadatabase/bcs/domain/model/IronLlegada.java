package com.magneticmediadatabase.bcs.domain.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class IronLlegada {
    private Long id;

    private LocalDateTime dateCreated;

    public IronLlegada() {
    }

    public IronLlegada(Long id, LocalDateTime dateCreated) {
        this.id = id;
        this.dateCreated = dateCreated;
    }
}
