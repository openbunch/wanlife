package com.wanlife.wanlife;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
		info = @Info(
				title = "WanLife",
				description = "RESTful Microservices APIs Documentation",
				version = "v1.0.0",
				contact = @Contact(
						name = "Justine Okumu",
						email = "okumujustine01@gmail.com",
						url = "https://okumujustine.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://okumujustine.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "WanLife Social Application",
				url = "git@github.com:openbunch/wanlife.git"
		)
)

@SpringBootApplication
public class WanlifeApplication {

	public static void main(String[] args) {
		SpringApplication.run(WanlifeApplication.class, args);
	}

}
