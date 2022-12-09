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

@ResponseStatus(HttpStatus.OK)
public class ValidacionOkException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = LoggerFactory.getLogger(ValidacionController.class);
		
	public ValidacionOkException() { 
		super("Se ha efectuado el pago correctamente");
		logger.info("------ Se ha efectuado el pago correctamente.");		
	}
	
	public ValidacionOkException(Long id) {
		super("Se ha efectuado el pago correctamente con " + id);
		logger.info("------ Se ha efectuado el pago correctamente con " + id);	
	}	
}
