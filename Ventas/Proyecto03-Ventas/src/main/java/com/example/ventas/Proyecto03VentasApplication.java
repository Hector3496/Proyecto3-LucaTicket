package com.example.ventas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Proyecto03VentasApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proyecto03VentasApplication.class, args);
	}

}
