package com.magneticmediadatabase.bcs.application.usecases;

import com.magneticmediadatabase.bcs.domain.port.in.DeleteIronLlegadaUseCase;
import com.magneticmediadatabase.bcs.domain.port.out.IronLlegadaRepositoryPort;

public class DeleteIronLlegadaUseCaseImpl implements DeleteIronLlegadaUseCase {
    private final IronLlegadaRepositoryPort ironLlegadaRepositoryPort;

    public DeleteIronLlegadaUseCaseImpl(IronLlegadaRepositoryPort ironLlegadaRepositoryPort) {
        this.ironLlegadaRepositoryPort = ironLlegadaRepositoryPort;
    }

    @Override
    public boolean deleteIronLlegada(Long id) {
        return ironLlegadaRepositoryPort.deleteById(id);
    }
}
