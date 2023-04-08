package com.magneticmediadatabase.bcs.infraestructure.repositories;

import com.magneticmediadatabase.bcs.infraestructure.entity.IronSalidaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaIronSalidaRepository extends JpaRepository<IronSalidaEntity, Long> {
}
