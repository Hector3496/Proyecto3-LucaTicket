package com.example.demo.controller;

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
	 * {GET [/carrito/throwException]}: throwException()
	 * Es un error normal y corriente
	 * No mapeado
	 */
    @GetMapping(value = "/validation/throwException")
    public void throwException() {
        throw new IllegalArgumentException("\"Soy el mensaje de error de Rest Controller\"");
    }
}
