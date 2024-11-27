package com.eazybytes.cards;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl") // // tell Spring Boot to activate JPA auditing (createDate, CreatedBy, LastModifiedDate, LastModifiedBy, etc.)
@OpenAPIDefinition(
		info = @Info(
				title = "Cards Microservice REST API Documentattion",
				description = "EazyBank Cards microservice REST API Documentation",
				version = "v1"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}

}
