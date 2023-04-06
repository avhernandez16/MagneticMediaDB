package com.magneticmediadatabase.bcs.application.service;

import com.magneticmediadatabase.bcs.domain.model.IronLlegada;
import com.magneticmediadatabase.bcs.domain.port.in.CreateIronLlegadaUseCase;
import com.magneticmediadatabase.bcs.domain.port.in.DeleteUseCase;
import com.magneticmediadatabase.bcs.domain.port.in.RetrieveIronLlegadaUseCase;
import com.magneticmediadatabase.bcs.domain.port.in.UpdateIronLlegadaUseCase;

import java.util.List;
import java.util.Optional;

public class IronLlegadaService implements CreateIronLlegadaUseCase, UpdateIronLlegadaUseCase, RetrieveIronLlegadaUseCase, DeleteUseCase {

    private final CreateIronLlegadaUseCase createIronLlegadaUseCase;
    private final UpdateIronLlegadaUseCase updateIronLlegadaUseCase;
    private final RetrieveIronLlegadaUseCase retrieveIronLlegadaUseCase;
    private final DeleteUseCase deleteUseCase;

    public IronLlegadaService(CreateIronLlegadaUseCase createIronLlegadaUseCase, UpdateIronLlegadaUseCase updateIronLlegadaUseCase, RetrieveIronLlegadaUseCase retrieveIronLlegadaUseCase, DeleteUseCase deleteUseCase) {
        this.createIronLlegadaUseCase = createIronLlegadaUseCase;
        this.updateIronLlegadaUseCase = updateIronLlegadaUseCase;
        this.retrieveIronLlegadaUseCase = retrieveIronLlegadaUseCase;
        this.deleteUseCase = deleteUseCase;
    }

    @Override
    public IronLlegada createIronLlegada(IronLlegada ironLlegada) {
        return createIronLlegadaUseCase.createIronLlegada(ironLlegada);
    }

    @Override
    public boolean deleteIronLlegada(Long id) {
        return deleteUseCase.deleteIronLlegada(id);
    }

    @Override
    public Optional<IronLlegada> getIronLlegada(Long id) {
        return retrieveIronLlegadaUseCase.getIronLlegada(id);
    }

    @Override
    public List<IronLlegada> getAllIronLlegada() {
        return retrieveIronLlegadaUseCase.getAllIronLlegada();
    }

    @Override
    public Optional<IronLlegada> updateIronLlegada(Long id, IronLlegada updateIronLlegada) {
        return updateIronLlegadaUseCase.updateIronLlegada(id,updateIronLlegada);
    }
}
