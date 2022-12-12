package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.example.ventas.model.Carrito;
import com.example.ventas.model.Evento;
import com.example.ventas.model.Usuario;

@ContextConfiguration
class Proyecto03VentasApplicationTests {

	
	//private CarritoService carritoService;
	@Autowired
	private Carrito carrito;
	
	@Autowired
	private Evento eventos;
	
	@Autowired
	private Usuario usuarios;

	@Test
	void contextLoads() {
		assertThat(true).isTrue();
	}
	@Test
	void test01() {
		carrito = new Carrito();
	assertThat(carrito).isNotNull();	
	}
	@Test
	void test02() {
		carrito = new Carrito();
		usuarios = new Usuario();
		usuarios.setId(5);
		carrito.setIdusuario(usuarios.getId());
	assertThat(carrito.getIdusuario()).isNotNull();	
	}
	@Test
	void test03() {
		usuarios = new Usuario();
		usuarios.setId(10);
	assertThat(usuarios).isNotNull();	
	}

}
