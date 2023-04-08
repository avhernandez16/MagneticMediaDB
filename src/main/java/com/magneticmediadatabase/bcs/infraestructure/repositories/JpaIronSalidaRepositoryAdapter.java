package com.magneticmediadatabase.bcs.infraestructure.repositories;

import com.magneticmediadatabase.bcs.domain.model.IronSalida;
import com.magneticmediadatabase.bcs.domain.port.out.IronSalidaRepositoryPort;
import com.magneticmediadatabase.bcs.infraestructure.entity.IronSalidaEntity;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JpaIronSalidaRepositoryAdapter implements IronSalidaRepositoryPort {

    private final JpaIronSalidaRepository jpaIronSalidaRepository;

    public JpaIronSalidaRepositoryAdapter(JpaIronSalidaRepository jpaIronSalidaRepository) {
        this.jpaIronSalidaRepository = jpaIronSalidaRepository;
    }

    @Override
    public IronSalida save(IronSalida ironSalida) {
        IronSalidaEntity ironSalidaEntity = IronSalidaEntity.fromDomainModel(ironSalida);
        IronSalidaEntity savedIronSalidaEntity = jpaIronSalidaRepository.save(ironSalidaEntity);
        return savedIronSalidaEntity.toDomainModel();
    }

    @Override
    public Optional<IronSalida> findById(Long id) {
        return jpaIronSalidaRepository.findById(id).map(IronSalidaEntity::toDomainModel);
    }

    @Override
    public List<IronSalida> findAll() {
        return jpaIronSalidaRepository.findAll().stream()
                .map(IronSalidaEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<IronSalida> update(IronSalida ironSalida) {
        if(jpaIronSalidaRepository.existsById(ironSalida.getId())){
            IronSalidaEntity ironSalidaEntity = IronSalidaEntity.fromDomainModel(ironSalida);
            IronSalidaEntity updateIronSalidaEntity = jpaIronSalidaRepository.save(ironSalidaEntity);
            return Optional.of(updateIronSalidaEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if(jpaIronSalidaRepository.existsById(id)){
            jpaIronSalidaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
