package com.example.usuarios.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.usuarios.adapter.UsuarioAdapter;
import com.example.usuarios.model.Usuario;
import com.example.usuarios.response.UsuarioDTO;
import com.example.usuarios.services.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	private static final Logger log = LoggerFactory.getLogger(UsuarioController.class);

	@Autowired
	private UsuarioService srv;
	
	@Autowired
	private UsuarioAdapter adapter;
	
	@PostMapping("/addUsuario")
	public UsuarioDTO altaUsuario(@RequestBody Usuario usuario) {
		final Usuario user = srv.save(usuario);
		return adapter.of(user);
	}
}
