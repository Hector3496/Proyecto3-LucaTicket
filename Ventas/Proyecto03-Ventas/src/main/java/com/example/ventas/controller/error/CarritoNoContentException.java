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

@ResponseStatus(HttpStatus.NO_CONTENT)
public class CarritoNoContentException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = LoggerFactory.getLogger(CarritoController.class);
		
	public CarritoNoContentException() { 
		super("El carrito no tiene contenido");
		logger.info("------ El carrito no tiene contenido");		
	}
	
	public CarritoNoContentException(Long id) {
		super("El carrito con id " + id + " no tiene contenido");
		logger.info("------ El carrito con id " + id + " no tiene contenido");	
	}	
}
