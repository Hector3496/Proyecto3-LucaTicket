package com.example.usuarios.services;
import java.util.List;

import com.example.usuarios.model.Usuario;
/**
 *@author Raul
 */

public interface UsuarioService {

	/**
	 * 
	 * @param usuario con los datos para salvar
	 */
	public Usuario save(Usuario usuario);
	
	public List<Usuario> findAll();
}
