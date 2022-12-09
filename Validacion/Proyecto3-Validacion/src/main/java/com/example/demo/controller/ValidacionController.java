package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/validation")
public class ValidacionController {

	private static final Logger log = LoggerFactory.getLogger(ValidacionController.class);
	
    @GetMapping
    public ResponseEntity<String> validation() {
        int validation = ((int) (Math.random()*(4+1)));
        if (validation == 1){
            log.info("--------------------- VALIDACION OK " + validation);
            return validationOK();
        }
        else if(validation == 2){
            log.info("--------------------- VALIDACION NO CONTENT " + validation());
            return validationNoContent(); 
        }
        else if(validation == 3){
            log.info("--------------------- VALIDACION UNAUTHORIZED" + validation());
            return validationUnauthorized();
        }
        else if(validation == 4){
            log.info("--------------------- VALIDACION NOT FOUND" + validation());
            return validationNotFound();
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST + ": Ha ocurrido un error inesperado.", HttpStatus.BAD_REQUEST); 
    }
    
    private ResponseEntity<String> validationOK(){
    	return new ResponseEntity<>(HttpStatus.OK + ": Se ha efectuado el pago correctamente.", HttpStatus.OK);
    }
    private ResponseEntity<String> validationNoContent(){
        return new ResponseEntity<>(HttpStatus.NO_CONTENT + ": Faltan datos del titular de la tarjeta.", HttpStatus.NO_CONTENT);
    }
    private ResponseEntity<String> validationUnauthorized(){
        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED + ": El saldo de su cuenta es negativo.", HttpStatus.UNAUTHORIZED);
    }
    private ResponseEntity<String> validationNotFound(){
        return new ResponseEntity<>(HttpStatus.NOT_FOUND + ":  Numero de tarjeta incorrecto.", HttpStatus.NOT_FOUND);
    }
    
}
