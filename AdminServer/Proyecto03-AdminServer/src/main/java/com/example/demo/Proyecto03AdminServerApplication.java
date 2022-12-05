package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

//Esto permite tener un server que administre la monitorización
@EnableAdminServer
@SpringBootApplication
public class Proyecto03AdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proyecto03AdminServerApplication.class, args);
	}

}
