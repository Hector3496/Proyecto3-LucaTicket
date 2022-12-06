package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Date;
import java.util.Calendar;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.example.eventos.model.Evento;
import com.example.eventos.adapter.*;
@ContextConfiguration
class Proyecto03EventosApplicationTests {

	@Autowired
	private EventoAdapter productController;
	
	@Autowired
	private Evento evento;

	@Test
	void contextLoads() {
		assertThat(productController).isNotNull();
	}
	@Test
	void prueba1() {
		evento = new Evento();
		evento.setNormas("Portarse bien");
		assertThat(evento.getNormas()).isNotNull();
	}
	@Test
	void prueba2() {
	//productController = new ProductDTO();
	//	productController.setPrice(700.0);
	//	assertThat(productController.getPrice()).isNull();
		
		
	}
	
	@Test
	void prueba3() {
		evento = new Evento();
		evento.setSalaNombre("Juan");
		assertThat(evento.getNombre()).isNotNull();
	}
	
	@Test
	void prueba4() {
		evento = new Evento();
		evento.setDescripcionCorta("Un local chulisimo");
		assertThat(evento.getDescripcionCorta()).isNotNull();
	}
	
	@Test
	void prueba5() {
		evento = new Evento();
		 evento.setHoraEvento("16:30");
		 assertThat(evento.getHoraEvento()).isEqualTo("16:30");
		
	}
	
	@Test
	void prueba6() {
		evento = new Evento();
		evento.setPrecios(150.50);
		assertThat(evento.getPrecios()).isNotNegative();
		
	}

	@Test
	void prueba7(){
		evento = new Evento();
		evento.setPrecios(150.00);
		assertThat(evento.getPrecios()).isNotNull();
	}
	
	@Test
	void prueba8() {
		evento = new Evento();
		evento.setSalaAforo(200);
		assertThat(evento.getSalaAforo()).isNotNull();
		
	}
	
	@Test
	void prueba9() {
		evento = new Evento();
		evento.setSalaAforo(200);
		assertThat(evento.getSalaAforo()).isNotNegative();
		
	}
	@Test
	void pruebaGenero() {
		evento = new Evento();
		evento.setGenre("Ficcion");
		assertThat(evento.getGenre()).isNotNull();
	}
	@Test
	void pruebaGenero2() {
		evento = new Evento();
		evento.setGenre("Ficcion");
		assertThat(evento.getGenre()).isNotEmpty();
	}
}
