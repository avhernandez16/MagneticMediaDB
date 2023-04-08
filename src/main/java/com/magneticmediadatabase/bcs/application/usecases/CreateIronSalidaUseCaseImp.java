package com.magneticmediadatabase.bcs.application.usecases;

import com.magneticmediadatabase.bcs.domain.model.IronSalida;
import com.magneticmediadatabase.bcs.domain.port.in.CreateIronSalidaUseCase;
import com.magneticmediadatabase.bcs.domain.port.out.IronSalidaRepositoryPort;

public class CreateIronSalidaUseCaseImp implements CreateIronSalidaUseCase {
    private final IronSalidaRepositoryPort ironSalidaRepositoryPort;

    public CreateIronSalidaUseCaseImp(IronSalidaRepositoryPort ironSalidaRepositoryPort) {
        this.ironSalidaRepositoryPort = ironSalidaRepositoryPort;
    }

    @Override
    public IronSalida createIronSalida(IronSalida ironSalida) {
        return ironSalidaRepositoryPort.save(ironSalida);
    }
}
