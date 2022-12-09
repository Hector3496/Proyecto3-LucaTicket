package com.example.demo.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.error.ValidacionDefaultException;
import com.example.demo.controller.error.ValidacionNoContentException;
import com.example.demo.controller.error.ValidacionNotFoundException;
import com.example.demo.controller.error.ValidacionOkException;
import com.example.demo.controller.error.ValidacionUnauthorizedException;
import com.example.demo.model.Validacion;
import com.example.demo.service.ValidacionService;

@RestController
@RequestMapping("/validation")
public class ValidacionController {

	private static final Logger log = LoggerFactory.getLogger(ValidacionController.class);
	
	@Autowired
	private ValidacionService srv;
    @GetMapping
    public Validacion validation() {
        int validation = ((int) (Math.random()*(4+1)));
        if (validation == 1){
            log.info("--------------------- VALIDACION OK " + validation);
            return srv.validationOK(1).orElseThrow(ValidacionOkException::new);
        }
        else if(validation == 2){
            log.info("--------------------- VALIDACION NO CONTENT " + validation());
            return srv.validationNoContent(1).orElseThrow(ValidacionNoContentException::new); 
        }
        else if(validation == 3){
            log.info("--------------------- VALIDACION UNAUTHORIZED" + validation());
            return srv.validationUnauthorized(1).orElseThrow(ValidacionUnauthorizedException::new);
        }
        else if(validation == 4){
            log.info("--------------------- VALIDACION NOT FOUND" + validation());
            return srv.validationNotFound(1).orElseThrow(ValidacionNotFoundException::new);
        }
        return srv.validationDefault(1).orElseThrow(ValidacionDefaultException::new);
    }
    
}
