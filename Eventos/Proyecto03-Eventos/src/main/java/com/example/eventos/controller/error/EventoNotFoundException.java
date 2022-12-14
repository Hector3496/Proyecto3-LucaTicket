package com.example.eventos.controller.error;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.eventos.controller.EventoController;

/**
 *
 * @author Susana Diaz
 */

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EventoNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = LoggerFactory.getLogger(EventoController.class);
		
	public EventoNotFoundException() { 
		super("No existe el evento");
		logger.info("------ No existe el evento");		
	}
	
	public EventoNotFoundException(Long id) {
		super("No existe el evento " + id);
		logger.info("------ No existe el evento " + id);	
	}	
}