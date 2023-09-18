package com.example.AcademicRecords.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenAPIConfig {

	@Bean
	public OpenAPI usersMicroserviceOpenAPI() {
		return new OpenAPI()
				.info(new Info().title("Academic Records API").description("No Description").version("1.0"));
	}
}
