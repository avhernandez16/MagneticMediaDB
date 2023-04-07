package com.magneticmediadatabase.bcs.infraestructure.conf;

import com.magneticmediadatabase.bcs.application.service.IronLlegadaService;
import com.magneticmediadatabase.bcs.application.usecases.CreateIronLlegadaUseCaseImpl;
import com.magneticmediadatabase.bcs.application.usecases.DeleteIronLlegadaUseCaseImpl;
import com.magneticmediadatabase.bcs.application.usecases.RetrieveIronLlegadaUseCaseImpl;
import com.magneticmediadatabase.bcs.application.usecases.UpdateIronLlegadaUseCaseImpl;
import com.magneticmediadatabase.bcs.domain.port.out.ExternalServicePort;
import com.magneticmediadatabase.bcs.domain.port.out.IronLlegadaRepositoryPort;
import com.magneticmediadatabase.bcs.infraestructure.repositories.JpaIronLlegadaRepositoryAdapter;
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

}
