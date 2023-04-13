package com.teste.fodase.fodase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class FodaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(FodaseApplication.class, args);
	}

}
