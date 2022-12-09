package com.example.ventas.controller.error;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.ventas.controller.CarritoController;

/**
 *
 * @author Susana Diaz
 */

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CarritoNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = LoggerFactory.getLogger(CarritoController.class);
		
	public CarritoNotFoundException() { 
		super("No existe el carrito");
		logger.info("------ No existe el carrito");		
	}
	
	public CarritoNotFoundException(Long id) {
		super("No existe el carrito " + id);
		logger.info("------ No existe el carrito " + id);	
	}	
}
