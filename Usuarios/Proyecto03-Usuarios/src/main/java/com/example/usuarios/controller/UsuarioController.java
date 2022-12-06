package com.example.usuarios.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.usuarios.adapter.UsuarioAdapter;
import com.example.usuarios.controller.error.UsuarioNotFoundException;
import com.example.usuarios.model.Usuario;
import com.example.usuarios.response.UsuarioDTO;
import com.example.usuarios.services.UsuarioService;

import io.swagger.v3.oas.annotations.tags.Tag;

/*
 * Clase UsuarioController para definir los metodos altaUsuario() y leerUsuarios()
 */

@RestController
@RequestMapping("/usuarios")
@Tag(name = "usuarios", description = "the Usuarios API")
public class UsuarioController {

	private static final Logger log = LoggerFactory.getLogger(UsuarioController.class);

	@Autowired
	private UsuarioService srv;
	
	@Autowired
	private UsuarioAdapter adapter;
	
	/*
	 * Metodo altaUsuario() para añadir un usuario dado y devuelve la URI
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
	@GetMapping("/{id}")
	public Usuario readEvento(@PathVariable int id) {
		return srv.findById(id).orElseThrow(UsuarioNotFoundException::new);
	}
	@PutMapping
	public void uploadEvento(@RequestBody Usuario user) {
		srv.save(user);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUsuario(@PathVariable int id) {
		srv.deleteById(id);
	}
	/*
	 * Metodo altaUsuario() para añadir un usuario dado y devuelve el recurso
	 */
	@PostMapping("/addUsuario/")
	public Usuario addUsuario(@Valid @RequestBody Usuario usuario) {
			
		log.info("------ addUsuario (POST)");
		Usuario result = this.srv.save(usuario);
		log.info("------ Dato Guardado " + result);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(result.getId())
				.toUri();
		
		return result;
	}
}
