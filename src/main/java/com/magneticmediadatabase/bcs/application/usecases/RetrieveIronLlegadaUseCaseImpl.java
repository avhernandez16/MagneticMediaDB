package com.magneticmediadatabase.bcs.application.usecases;

import com.magneticmediadatabase.bcs.domain.model.IronLlegada;
import com.magneticmediadatabase.bcs.domain.port.in.RetrieveIronLlegadaUseCase;
import com.magneticmediadatabase.bcs.domain.port.out.IronLlegadaRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveIronLlegadaUseCaseImpl implements RetrieveIronLlegadaUseCase {
    private final IronLlegadaRepositoryPort ironLlegadaRepositoryPort;

    public RetrieveIronLlegadaUseCaseImpl(IronLlegadaRepositoryPort ironLlegadaRepositoryPort) {
        this.ironLlegadaRepositoryPort = ironLlegadaRepositoryPort;
    }

    @Override
    public Optional<IronLlegada> getIronLlegada(Long id) {
        return ironLlegadaRepositoryPort.findById(id);
    }

    @Override
    public List<IronLlegada> getAllIronLlegada() {
        return ironLlegadaRepositoryPort.findAll();
    }
}
