package com.magneticmediadatabase.bcs.domain.port.out;

import com.magneticmediadatabase.bcs.domain.model.IronLlegada;

import java.util.List;
import java.util.Optional;

public interface IronLlegadaRepositoryPort {
    IronLlegada save(IronLlegada ironLlegada);
    Optional<IronLlegada> findById(Long id);
    List<IronLlegada> findAll();
    Optional<IronLlegada> update(IronLlegada ironLlegada);
    boolean deleteById(Long id);
}
