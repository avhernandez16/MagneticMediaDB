package com.magneticmediadatabase.bcs.application.usecases;

import com.magneticmediadatabase.bcs.domain.model.IronLlegada;
import com.magneticmediadatabase.bcs.domain.port.in.CreateIronLlegadaUseCase;
import com.magneticmediadatabase.bcs.domain.port.out.IronLlegadaRepositoryPort;

public class CreateIronLlegadaUseCaseImpl implements CreateIronLlegadaUseCase {
    private final IronLlegadaRepositoryPort ironLlegadaRepositoryPort;

    public CreateIronLlegadaUseCaseImpl(IronLlegadaRepositoryPort ironLlegadaRepositoryPort) {
        this.ironLlegadaRepositoryPort = ironLlegadaRepositoryPort;
    }

    @Override
    public IronLlegada createIronLlegada(IronLlegada ironLlegada) {
        return ironLlegadaRepositoryPort.save(ironLlegada);
    }
}
