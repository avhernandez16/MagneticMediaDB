package com.magneticmediadatabase.bcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MagneticMediaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MagneticMediaApplication.class, args);
		System.out.println("Cerrando la conexión");
	}

}
