package com.magneticmediadatabase.bcs.domain.port.In;

import com.magneticmediadatabase.bcs.domain.model.IronLlegada;

import java.util.Optional;

public interface UpdateIronLlegadaUseCase{
    Optional<IronLlegada> updateIronLlegada (Long id, IronLlegada updateIronLlegada);//el id puede o no estar por eso se usa optional y le envio esos parametros
}
