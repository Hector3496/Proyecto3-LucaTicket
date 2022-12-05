package com.example.usuarios.services;

import java.util.List;

/**
 * @author Raul

 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.usuarios.model.Usuario;
import com.example.usuarios.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	/**
	 * 
	 * Implementamos la clase  UsuarioRepository del paquete Repository
	 *
	 */
	@Autowired
	private UsuarioRepository repo;

	
	/**
	 * Sobreescribimos el metodo findAll() de UsuarioService
	 */	
	@Override
	public List<Usuario> findAll() {
		return repo.findAll();
	}

	/**
	 * Sobreescribimos el metodo save() de UsuarioService 
	 * Utilizamos los datos de la clase Usuario del paquete model
	 */	
	@Override
	public Usuario save(Usuario usuario) {
		return repo.save(usuario);
	}
}
