package com.magneticmediadatabase.bcs.domain.port.in;


import com.magneticmediadatabase.bcs.domain.model.IronSalida;

import java.util.Optional;

public interface UpdateIronSalidaUseCase {
    Optional<IronSalida> UpdateIronSalida(Long id, IronSalida UpdateIronSalida);
}
