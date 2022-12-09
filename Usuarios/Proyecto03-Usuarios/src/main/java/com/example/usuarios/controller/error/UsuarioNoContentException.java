package com.example.usuarios.controller.error;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.usuarios.controller.UsuarioController;

/**
 *
 * @author Susana Diaz
 */

@ResponseStatus(HttpStatus.NO_CONTENT)
public class UsuarioNoContentException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);
		
	public UsuarioNoContentException() { 
		super("El usuario no tiene contenido");
		logger.info("------ El usuario no tiene contenido");		
	}
	
	public UsuarioNoContentException(Long id) {
		super("El usuario con id " + id + " no tiene contenido");
		logger.info("------ El usuario con id " + id + " no tiene contenido");	
	}	
}
