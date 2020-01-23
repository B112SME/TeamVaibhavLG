package com.crts.app.LoanGenerationSanction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;
@EnableJpaRepositories
@SpringBootApplication
public class LoanPaymentDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanPaymentDetailsApplication.class, args);
	}
	@Bean

	public RestTemplate getrst()
	{
		return new RestTemplate();
		
	}
}
