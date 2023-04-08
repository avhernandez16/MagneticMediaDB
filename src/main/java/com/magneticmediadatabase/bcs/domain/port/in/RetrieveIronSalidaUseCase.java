package com.magneticmediadatabase.bcs.domain.port.in;

import com.magneticmediadatabase.bcs.domain.model.IronSalida;

import java.util.List;
import java.util.Optional;

public interface RetrieveIronSalidaUseCase {

    Optional<IronSalida> getTask(Long id);
    List<IronSalida> getAllIronSalida();
}
