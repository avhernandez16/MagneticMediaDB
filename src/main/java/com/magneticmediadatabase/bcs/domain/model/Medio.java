package com.magneticmediadatabase.bcs.domain.model;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Medio{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Integer id;
    private final String codigoCinta;

    public Medio(Integer id, String codigoCinta) {
        this.id = id;
        this.codigoCinta = codigoCinta;
    }
}


