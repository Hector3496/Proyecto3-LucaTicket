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

@ResponseStatus(HttpStatus.NO_CONTENT)
public class EventoNoContentException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = LoggerFactory.getLogger(EventoController.class);
		
	public EventoNoContentException() { 
		super("El evento no tiene contenido");
		logger.info("------ El evento no tiene contenido");		
	}
	
	public EventoNoContentException(Long id) {
		super("El evento con id " + id + " no tiene contenido");
		logger.info("------ El evento con id " + id + " no tiene contenido");	
	}	
}
