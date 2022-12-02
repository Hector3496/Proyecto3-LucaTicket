package com.example.usuarios.services;

/**
 * @author Raul
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	 * Sobreescribimos el metodo  Save de UsuarioService 
	 * Utilizamos los datos de la clase Usuario del paquete model
	 */
	@Override
	public void save(Usuario usuario) {
		repo.save(usuario);
	}
}
