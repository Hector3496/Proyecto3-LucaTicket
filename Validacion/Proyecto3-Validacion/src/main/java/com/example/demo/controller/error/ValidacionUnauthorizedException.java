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

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class ValidacionUnauthorizedException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = LoggerFactory.getLogger(ValidacionController.class);
		
	public ValidacionUnauthorizedException() { 
		super("El saldo de su cuenta es negativo");
		logger.info("------ El saldo de su cuenta es negativo.");		
	}
	
	public ValidacionUnauthorizedException(Long id) {
		super("El saldo de su cuenta es negativo con " + id);
		logger.info("------ El saldo de su cuenta con " + id + " es negativo");	
	}	
}
