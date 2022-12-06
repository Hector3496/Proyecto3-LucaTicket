package com.example.usuarios.config;


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
    public OpenAPI UsuarioOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Usuarios API")
                .description("Documentación del Usuarios API")
                .version("v1.0")
                .contact(new Contact().name("Grupo 3").
                        url("https://grupo3.es").email("grupo@tres.es"))
                .license(new License().name("LICENSE").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                .description("Proyecto de guardar en BBDD (MySQL), Crear, Leer, Actualizar y Eliminar. Incluimos algunos listados de busquedas")
                .url("http://localhost:8083/usuarios"));
    }
	

}
