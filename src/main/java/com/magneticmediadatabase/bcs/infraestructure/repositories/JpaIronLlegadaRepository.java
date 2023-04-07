package com.magneticmediadatabase.bcs.infraestructure.repositories;

import com.magneticmediadatabase.bcs.infraestructure.entity.IronLlegadaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaIronLlegadaRepository extends JpaRepository<IronLlegadaEntity, Long> {
}
