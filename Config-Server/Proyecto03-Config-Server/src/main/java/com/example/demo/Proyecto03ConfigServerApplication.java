package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Proyecto03ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proyecto03ConfigServerApplication.class, args);
	}

}
