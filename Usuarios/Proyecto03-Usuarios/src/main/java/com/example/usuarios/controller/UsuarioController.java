package com.example.usuarios.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.usuarios.adapter.UsuarioAdapter;
import com.example.usuarios.model.Usuario;
import com.example.usuarios.response.UsuarioDTO;
import com.example.usuarios.services.UsuarioService;

/*
 * Clase UsuarioController para definir los metodos altaUsuario() y leerUsuarios()
 */

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	private static final Logger log = LoggerFactory.getLogger(UsuarioController.class);

	@Autowired
	private UsuarioService srv;
	
	@Autowired
	private UsuarioAdapter adapter;
	
	/*
	 * Metodo altaUsuario() para añadir un usuario dado
	 */
	@PostMapping("/addUsuario")
	public UsuarioDTO altaUsuario(@RequestBody Usuario usuario) {
		final Usuario user = srv.save(usuario);
		return adapter.of(user);
	}
	
	/*
	 * Metodo leerUsuarios() para leer un listado de usuarios
	 */
	@GetMapping("/leerUsuarios")
		public List <UsuarioDTO> leerUsuarios() {
		final List <Usuario> user=srv.findAll();
		return adapter.of(user);
	}
}
