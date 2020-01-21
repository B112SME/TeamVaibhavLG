package com.crts.app.LoanGenrationandSanction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;
@EnableJpaRepositories
@SpringBootApplication
public class LoanGenrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanGenrationApplication.class, args);
	}

@Bean
public RestTemplate RT()
{
	return new RestTemplate();
	
}
}
