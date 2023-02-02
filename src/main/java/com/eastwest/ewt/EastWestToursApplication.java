package com.eastwest.ewt;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "EastWest Tours API",
				description = "API Definitions of the EastWest Tours Microservices",
				version = "0.0.1"
		)
)
public class EastWestToursApplication {
	public static void main(String[] args) {
		SpringApplication.run(EastWestToursApplication.class, args);
	}
}
