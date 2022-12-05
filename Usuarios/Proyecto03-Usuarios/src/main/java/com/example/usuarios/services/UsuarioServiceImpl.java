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

	/*
	 * Implementar clase UsuarioRepository del paquete Repository
	 *
	 */
	@Autowired
	private UsuarioRepository repo;

	/*
	 * Sobreescribir metodo findAll() de UsuarioService
	 * Metodo findAll() para obtener un listado de usuarios
	 */
	@Override
	public List<Usuario> findAll() {
		return repo.findAll();
	}

	/*
	 * Sobreescribir metodo save() de UsuarioService 
	 * * Metodo save() para obtener un usuario dado
	 * @param usuario con los datos para salvar
	 */	
	@Override
	public Usuario save(Usuario usuario) {
		return repo.save(usuario);
	}
}
