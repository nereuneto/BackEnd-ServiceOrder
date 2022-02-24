package br.com.lupus.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI().info(
				new Info().title("Restful API")
						  .version("v1")
						  .description("Some descriptions")
						  .termsOfService("Terms")
						  .license(new License().name("Nereu").url("github.com/nereuneto/"))
				);
	}
}
