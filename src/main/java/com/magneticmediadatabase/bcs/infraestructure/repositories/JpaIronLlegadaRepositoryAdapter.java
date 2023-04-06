package com.magneticmediadatabase.bcs.infraestructure.repositories;

import com.magneticmediadatabase.bcs.domain.model.IronLlegada;
import com.magneticmediadatabase.bcs.domain.port.out.IronLlegadaRepositoryPort;
import com.magneticmediadatabase.bcs.infraestructure.entity.IronLlegadaEntity;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JpaIronLlegadaRepositoryAdapter implements IronLlegadaRepositoryPort {

    private final JpaIronLlegadaRepository jpaIronLlegadaRepository;

    public JpaIronLlegadaRepositoryAdapter(JpaIronLlegadaRepository jpaIronLlegadaRepository) {
        this.jpaIronLlegadaRepository = jpaIronLlegadaRepository;
    }

    @Override
    public IronLlegada save(IronLlegada ironLlegada) {
        IronLlegadaEntity ironLlegadaEntity = IronLlegadaEntity.fromDomainModel(ironLlegada);
        IronLlegadaEntity savedIronLlegadaEntity = jpaIronLlegadaRepository.save(ironLlegadaEntity);
        return savedIronLlegadaEntity.toDomainModel();
    }

    @Override
    public Optional<IronLlegada> findById(Long id) {
        return jpaIronLlegadaRepository.findById(id).map(IronLlegadaEntity::toDomainModel);
    }

    @Override
    public List<IronLlegada> findAll() {
        return jpaIronLlegadaRepository.findAll().stream()
                .map(IronLlegadaEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<IronLlegada> update(IronLlegada ironLlegada) {
        if (jpaIronLlegadaRepository.existsById(ironLlegada.getId())) {
            IronLlegadaEntity ironLlegadaEntity = IronLlegadaEntity.fromDomainModel(ironLlegada);
            IronLlegadaEntity updateIronLlegadaEntity = jpaIronLlegadaRepository.save(ironLlegadaEntity);
            return Optional.of(updateIronLlegadaEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if(jpaIronLlegadaRepository.existsById(id)){
            jpaIronLlegadaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
