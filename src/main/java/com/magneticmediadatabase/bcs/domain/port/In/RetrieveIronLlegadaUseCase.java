package com.magneticmediadatabase.bcs.domain.port.In;

import com.magneticmediadatabase.bcs.domain.model.IronLlegada;

import java.util.List;
import java.util.Optional;

public interface RetrieveIronLlegadaUseCase{
    Optional<IronLlegada> getIronLlegada (Long id);//obtener una remesa por id
    List<IronLlegada> getAllIronLlegada();//obtener todas las remesas
}
