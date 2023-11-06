package com.fabiocarlesso.datarestexemple.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("Data Rest Example - Rest API")
                .description("API exemplo de uso de Springboot REST API")
                .version("1.0")
                .termsOfService("Termo de uso: Open Source")
                .license(new License()
                    .name("Apache 2.0")
                    .url("http://www.fabiocarless.com")
                )
            ).externalDocs(
                new ExternalDocumentation()
                    .description("Seu nome")
                    .url("http://www.seusite.com.br"));
    }
}
