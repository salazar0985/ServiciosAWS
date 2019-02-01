package com.springaws.servicios.serviciosartifact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.springaws.servicios.serviciosartifact.mvc.model.dao")
@EntityScan("com.springaws.servicios.serviciosartifact.mvc.model.persistence")
@SpringBootApplication
public class ServiciosArtifactApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiciosArtifactApplication.class, args);
	}

}

