package com.magneticmediadatabase.bcs.application.usecases;

import com.magneticmediadatabase.bcs.domain.model.IronSalida;
import com.magneticmediadatabase.bcs.domain.port.in.UpdateIronSalidaUseCase;
import com.magneticmediadatabase.bcs.domain.port.out.IronSalidaRepositoryPort;

import java.util.Optional;

public class UpdateIronSalidaUseCaseImp implements UpdateIronSalidaUseCase {
    private final IronSalidaRepositoryPort ironSalidaRepositoryPort;

    public UpdateIronSalidaUseCaseImp(IronSalidaRepositoryPort ironSalidaRepositoryPort) {
        this.ironSalidaRepositoryPort = ironSalidaRepositoryPort;
    }

    @Override
    public Optional<IronSalida> UpdateIronSalida(Long id, IronSalida UpdateIronSalida) {
        return ironSalidaRepositoryPort.update(UpdateIronSalida);
    }
}
