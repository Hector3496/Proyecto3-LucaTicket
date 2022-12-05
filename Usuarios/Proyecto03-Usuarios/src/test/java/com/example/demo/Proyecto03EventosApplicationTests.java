package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.example.usuarios.model.Usuario;

@ContextConfiguration
class Proyecto03UsuariosApplicationTests {

	@Autowired
	private Usuario usuario;
	@Test
	void contextLoads() {
		
		assertThat(usuario).isNotNull();
	}
	
	@Test
	void test01() {
		usuario = new Usuario();
		usuario.setMail("pepe@hotmail.coom");
		assertThat(usuario.getMail()).contains("@");
	}
	@Test
	void test02() {
		usuario = new Usuario();
		usuario.setMail("pepe@hotmail.coom");
		assertThat(usuario.getMail()).contains(".");
	}
	
	@Test
	void test03() {
		usuario = new Usuario();
		usuario.setApellido("Gonzalez");
		assertThat(usuario.getApellido()).isNotNull();
	}
	
	@Test
	void test04() {
		usuario = new Usuario();
		usuario.setNombre("Juan");
		assertThat(usuario.getNombre()).isNotNull();
	}
	
	@Test
	void test05() {
		usuario = new Usuario();
		usuario.setFecha_alta(Date.valueOf("2022-12-05"));
		assertThat(usuario.getFecha_alta()).isNotNull();
	}

}
