package com.magneticmediadatabase.bcs.infraestructure.conf;

import com.magneticmediadatabase.bcs.application.service.IronLlegadaService;
import com.magneticmediadatabase.bcs.application.service.IronSalidaService;
import com.magneticmediadatabase.bcs.application.usecases.*;
import com.magneticmediadatabase.bcs.domain.port.out.ExternalServicePort;
import com.magneticmediadatabase.bcs.domain.port.out.IronLlegadaRepositoryPort;
import com.magneticmediadatabase.bcs.domain.port.out.IronSalidaRepositoryPort;
import com.magneticmediadatabase.bcs.infraestructure.repositories.JpaIronLlegadaRepositoryAdapter;
import com.magneticmediadatabase.bcs.infraestructure.repositories.JpaIronSalidaRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public IronLlegadaService ironLlegadaService(IronLlegadaRepositoryPort ironLlegadaRepositoryPort){
        return new IronLlegadaService(
                new CreateIronLlegadaUseCaseImpl(ironLlegadaRepositoryPort),
                new RetrieveIronLlegadaUseCaseImpl(ironLlegadaRepositoryPort),
                new UpdateIronLlegadaUseCaseImpl(ironLlegadaRepositoryPort),
                new DeleteIronLlegadaUseCaseImpl(ironLlegadaRepositoryPort)
        );
    }

    @Bean
    public IronLlegadaRepositoryPort ironLlegadaRepositoryPort(JpaIronLlegadaRepositoryAdapter jpaIronLlegadaRepositoryAdapter){
        return jpaIronLlegadaRepositoryAdapter;
    }

    @Bean
    public IronSalidaService ironSalidaService(IronSalidaRepositoryPort ironSalidaRepositoryPort){
        return new IronSalidaService(
                new CreateIronSalidaUseCaseImp(ironSalidaRepositoryPort),
                new RetrieveIronSalidaUseCaseImp(ironSalidaRepositoryPort),
                new UpdateIronSalidaUseCaseImp(ironSalidaRepositoryPort),
                new DeleteIronSalidaUseCaseImp(ironSalidaRepositoryPort)
        );
    }

    @Bean
    public IronSalidaRepositoryPort ironSalidaRepositoryPort(JpaIronSalidaRepositoryAdapter jpaIronSalidaRepositoryAdapter){
        return jpaIronSalidaRepositoryAdapter;
    }



}
