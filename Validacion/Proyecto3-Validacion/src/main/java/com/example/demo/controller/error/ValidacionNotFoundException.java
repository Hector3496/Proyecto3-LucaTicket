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

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ValidacionNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = LoggerFactory.getLogger(ValidacionController.class);
		
	public ValidacionNotFoundException() { 
		super("No existe la tarjeta");
		logger.info("------ Numero de tarjeta incorrecto.");		
	}
	
	public ValidacionNotFoundException(Long id) {
		super("No existe la tarjeta " + id);
		logger.info("------ Numero de tarjeta con" + id + " incorrecto");	
	}	
}
