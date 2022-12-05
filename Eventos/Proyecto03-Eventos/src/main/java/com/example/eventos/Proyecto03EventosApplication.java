package com.example.eventos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*Iniciar la aplicacion de spring y activar el cliente del microservicio Eventos
para el servidor eureka*/
@SpringBootApplication
@EnableDiscoveryClient
public class Proyecto03EventosApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proyecto03EventosApplication.class, args);
	}

}
