package com.example.usuarios.services;

import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	
	@Override
	public void deleteById(int id) {
		repo.deleteById(id);
	}

	@Override
	public Optional<Usuario> findById(int id) {
		return repo.findById(id);
	}
	@Override
	public boolean validarMail(Usuario usuario) {
		String mail=usuario.getMail();
		Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"); 
        Matcher mather = pattern.matcher(mail);
        return mather.find();
	}
}
