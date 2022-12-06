package com.example.usuarios.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Susana Diaz
 */

/*
 * @RestController para que todo sea automatico
 */
@RestController
public class ForceErrorRestController {

	/*
	 * {GET [/usuarios/throwException]}: throwException()
	 * Es un error normal y corriente
	 * No mapeado
	 */
    @GetMapping(value = "/usuarios/throwException")
    public void throwException() {
        throw new IllegalArgumentException("\"Soy el mensaje de error de Rest Controller\"");
    }
}
