package com.magneticmediadatabase.bcs.domain.port.out;

import com.magneticmediadatabase.bcs.domain.model.IronSalida;

import java.util.List;
import java.util.Optional;

public interface IronSalidaRepositoryPort {
    IronSalida save(IronSalida ironSalida);
    Optional<IronSalida> findById(Long id);
    List<IronSalida> findAll();
    Optional<IronSalida> update(IronSalida ironSalida);
    boolean deleteById(Long id);
}
