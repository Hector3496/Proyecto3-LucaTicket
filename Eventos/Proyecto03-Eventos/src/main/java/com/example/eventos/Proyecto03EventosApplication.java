package com.example.eventos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Proyecto03EventosApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proyecto03EventosApplication.class, args);
	}

}
