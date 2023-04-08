package com.magneticmediadatabase.bcs.application.usecases;

import com.magneticmediadatabase.bcs.domain.model.IronSalida;
import com.magneticmediadatabase.bcs.domain.port.in.RetrieveIronSalidaUseCase;
import com.magneticmediadatabase.bcs.domain.port.out.IronSalidaRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveIronSalidaUseCaseImp implements RetrieveIronSalidaUseCase {

    private final IronSalidaRepositoryPort ironSalidaRepositoryPort;

    public RetrieveIronSalidaUseCaseImp(IronSalidaRepositoryPort ironSalidaRepositoryPort) {
        this.ironSalidaRepositoryPort = ironSalidaRepositoryPort;
    }

    @Override
    public Optional<IronSalida> getIronSalida(Long id) {
        return ironSalidaRepositoryPort.findById(id);
    }

    @Override
    public List<IronSalida> getAllIronSalida() {
        return ironSalidaRepositoryPort.findAll();
    }
}
