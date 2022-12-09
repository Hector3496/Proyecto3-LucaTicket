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

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ValidacionDefaultException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = LoggerFactory.getLogger(ValidacionController.class);
		
	public ValidacionDefaultException() { 
		super("Ha ocurrido un error inesperado");
		logger.info("------ Ha ocurrido un error inesperado.");		
	}
	
	public ValidacionDefaultException(Long id) {
		super("Ha ocurrido un error inesperado con " + id);
		logger.info("------ Ha ocurrido un error inesperado con " + id);	
	}	
}
