package com.magneticmediadatabase.bcs.application.usecases;

import com.magneticmediadatabase.bcs.domain.model.IronLlegada;
import com.magneticmediadatabase.bcs.domain.port.in.UpdateIronLlegadaUseCase;
import com.magneticmediadatabase.bcs.domain.port.out.IronLlegadaRepositoryPort;

import java.util.Optional;

public class UpdateIronLlegadaUseCaseImpl implements UpdateIronLlegadaUseCase {
    private final IronLlegadaRepositoryPort ironLlegadaRepositoryPort;

    public UpdateIronLlegadaUseCaseImpl(IronLlegadaRepositoryPort ironLlegadaRepositoryPort) {
        this.ironLlegadaRepositoryPort = ironLlegadaRepositoryPort;
    }

    @Override
    public Optional<IronLlegada> updateIronLlegada(Long id, IronLlegada updateIronLlegada) {
        return ironLlegadaRepositoryPort.update(updateIronLlegada);
    }
}
