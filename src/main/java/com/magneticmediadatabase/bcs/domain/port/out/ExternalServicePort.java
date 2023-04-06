package com.magneticmediadatabase.bcs.domain.port.out;

import com.magneticmediadatabase.bcs.domain.model.Medio;

public interface ExternalServicePort{
    Medio getMedio(Long medioId);
}
