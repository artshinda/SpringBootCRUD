package com.bcaf.ic.SpringBootCRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootCRUDApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCRUDApplication.class, args);
	}

}
