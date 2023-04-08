package com.magneticmediadatabase.bcs.application.usecases;

import com.magneticmediadatabase.bcs.domain.port.in.DeleteIronSalidaUseCase;
import com.magneticmediadatabase.bcs.domain.port.out.IronSalidaRepositoryPort;

public class DeleteIronSalidaUseCaseImp implements DeleteIronSalidaUseCase {

    private final IronSalidaRepositoryPort ironSalidaRepositoryPort;

    public DeleteIronSalidaUseCaseImp(IronSalidaRepositoryPort ironSalidaRepositoryPort) {
        this.ironSalidaRepositoryPort = ironSalidaRepositoryPort;
    }

    @Override
    public boolean deleteIronSalida(Long id) {
        return ironSalidaRepositoryPort.deleteById(id);
    }
}
