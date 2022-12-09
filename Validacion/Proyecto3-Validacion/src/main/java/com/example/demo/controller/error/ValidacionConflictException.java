package com.example.demo.controller.error;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.controller.ValidacionController;


/**
 *
 * @author Susana Diaz
 */

@ResponseStatus(HttpStatus.CONFLICT)
public class ValidacionConflictException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = LoggerFactory.getLogger(ValidacionController.class);
		
	public ValidacionConflictException() { 
		super("Faltan datos del titular de la tarjeta");
		logger.info("------ Faltan datos del titular de la tarjeta");		
	}
	
	public ValidacionConflictException(Long id) {
		super("Faltan datos del titular de la tarjeta con id " + id + " que no tiene contenido");
		logger.info("------Faltan datos del titular de la tarjeta con id " + id + " que no tiene contenido");	
	}	
}
