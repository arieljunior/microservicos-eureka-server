package com.store.auth.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info=@Info(title = "Autenticação", description = "Microsserviço de autenticação", version = "v1", license = @License(name = "MIT", url = "http://localhost")))
public class SwaggerConfiguration {
}
