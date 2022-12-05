package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*Iniciar la aplicacion de spring y activar el servidor eureka*/
@SpringBootApplication
@EnableEurekaServer
public class Proyecto03EurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proyecto03EurekaApplication.class, args);
	}

}
