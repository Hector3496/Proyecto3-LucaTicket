package com.example.usuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.usuarios.model.Usuario;

/*
 * Interface UsuarioRepository 
 */

public interface UsuarioRepository extends JpaRepository <Usuario, Integer> {
	public void deleteById(Long id);


}
