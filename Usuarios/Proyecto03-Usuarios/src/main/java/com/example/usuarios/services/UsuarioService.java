package com.example.usuarios.services;
import java.util.List;
import java.util.Optional;

import com.example.usuarios.model.Usuario;

/*
 *@author Raul
 */

/*
 * Interface UsuarioService
 */
public interface UsuarioService {

	/*
	 * Metodo save() para obtener un usuario dado
	 * @param usuario con los datos para salvar
	 */
	public Usuario save(Usuario usuario);
	
	/*
	 * Metodo findAll() para obtener un listado de usuarios
	 */
	public List<Usuario> findAll();
	
	public Optional<Usuario> findById(int id);

	public void deleteById(int id);

}
