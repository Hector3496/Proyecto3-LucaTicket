package com.example.ventas.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;


@Configuration
public class OpenApiConfig {
	
    @Bean
    public OpenAPI VentasOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Ventas API")
                .description("Documentación de las ventas API")
                .version("v1.0")
                .contact(new Contact().name("Grupo 3").
                        url("https://grupo3.es").email("grupo@tres.es"))
                .license(new License().name("LICENSE").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                .description("Proyecto realizar una venta, Crear y Leer. Incluimos algunos listados de busquedas")
                .url("http://localhost:8085/videojuegos"));
    }
	

}
