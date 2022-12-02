package com.example.eventos.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.eventos.model.Evento;
import com.example.eventos.services.EventoService;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    private static final Logger log = LoggerFactory.getLogger(EventoController.class);
    
    @Autowired
    private EventoService srv;
    
    @PostMapping("/addEvento")
    public void altaEventos(@RequestBody Evento evento) {
    	srv.save(evento);
    }

}