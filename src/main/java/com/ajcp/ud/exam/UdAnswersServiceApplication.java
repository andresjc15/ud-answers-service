package com.ajcp.ud.exam;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@OpenAPIDefinition(
		info = @Info(title = "Answers service",
				version = "1.0.0",
				description = "Answers Microservice"))
public class UdAnswersServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdAnswersServiceApplication.class, args);
	}

}
