package com.crts.app.sme.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
@SpringBootApplication
public class LoanGenerationSanctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanGenerationSanctionApplication.class, args);
	}

}
