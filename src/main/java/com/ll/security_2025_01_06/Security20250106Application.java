package com.ll.security_2025_01_06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Security20250106Application {

	public static void main(String[] args) {
		SpringApplication.run(Security20250106Application.class, args);
	}

}
