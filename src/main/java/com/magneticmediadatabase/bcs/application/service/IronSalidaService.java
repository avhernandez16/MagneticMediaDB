package com.magneticmediadatabase.bcs.application.service;
import com.magneticmediadatabase.bcs.domain.model.IronSalida;
import com.magneticmediadatabase.bcs.domain.port.in.CreateIronSalidaUseCase;
import com.magneticmediadatabase.bcs.domain.port.in.DeleteIronSalidaUseCase;
import com.magneticmediadatabase.bcs.domain.port.in.RetrieveIronSalidaUseCase;
import com.magneticmediadatabase.bcs.domain.port.in.UpdateIronSalidaUseCase;

import java.util.List;
import java.util.Optional;

public class IronSalidaService implements CreateIronSalidaUseCase, DeleteIronSalidaUseCase, RetrieveIronSalidaUseCase, UpdateIronSalidaUseCase {

    private final CreateIronSalidaUseCase createIronSalidaUseCase;
    private final RetrieveIronSalidaUseCase retrieveIronSalidaUseCase;
    private final UpdateIronSalidaUseCase updateIronSalidaUseCase;
    private final DeleteIronSalidaUseCase deleteIronSalidaUseCase;

    public IronSalidaService(CreateIronSalidaUseCase createIronSalidaUseCase,
                             RetrieveIronSalidaUseCase retrieveIronSalidaUseCase,
                             UpdateIronSalidaUseCase updateIronSalidaUseCase,
                             DeleteIronSalidaUseCase deleteIronSalidaUseCase)
    {
        this.createIronSalidaUseCase = createIronSalidaUseCase;
        this.retrieveIronSalidaUseCase = retrieveIronSalidaUseCase;
        this.updateIronSalidaUseCase = updateIronSalidaUseCase;
        this.deleteIronSalidaUseCase = deleteIronSalidaUseCase;
    }


    @Override
    public IronSalida createIronSalida(IronSalida ironSalida) {
        return createIronSalidaUseCase.createIronSalida(ironSalida);
    }

    @Override
    public boolean deleteIronSalida(Long id) {
        return deleteIronSalidaUseCase.deleteIronSalida(id) ;
    }

    @Override
    public Optional<IronSalida> getIronSalida(Long id) {
        return retrieveIronSalidaUseCase.getIronSalida(id);
    }

    @Override
    public List<IronSalida> getAllIronSalida() {
        return retrieveIronSalidaUseCase.getAllIronSalida();
    }

    @Override
    public Optional<IronSalida> UpdateIronSalida(Long id, IronSalida UpdateIronSalida) {
        return updateIronSalidaUseCase.UpdateIronSalida(id, UpdateIronSalida);
    }
}
