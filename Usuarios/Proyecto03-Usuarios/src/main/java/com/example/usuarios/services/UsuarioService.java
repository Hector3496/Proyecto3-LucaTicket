package com.example.usuarios.services;
/**
 *@author Raul
 */
import com.example.usuarios.model.Usuario;

public interface UsuarioService {

	/**
	 * 
	 * @param usuario con los datos para salvar
	 */
	public Usuario save(Usuario usuario);
}
