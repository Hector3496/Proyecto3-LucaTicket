package com.example.usuarios.controller.error;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.usuarios.controller.UsuarioController;

/**
 *
 * @author Susana Diaz
 */

public class UsuarioNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);
		
	public UsuarioNotFoundException() { 
		super("No existe el usuario");
		logger.info("------ No existe el usuario");		
	}
	
	public UsuarioNotFoundException(Long id) {
		super("No existe el usuario " + id);
		logger.info("------ No existe el usuario " + id);	
	}	
}
