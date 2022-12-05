package com.example.eventos.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.eventos.adapter.EventoAdapter;
import com.example.eventos.model.Evento;
import com.example.eventos.response.EventoDTO;
import com.example.eventos.services.EventoService;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    private static final Logger log = LoggerFactory.getLogger(EventoController.class);
    
    @Autowired
    private EventoService srv;
    @
    Autowired
	private EventoAdapter adapter;
    
	@GetMapping
	public List<EventoDTO> readEventos(){
		final List<Evento> events = srv.findAll();
		return adapter.of(events);
	}
    @PostMapping("/addEvento")
    public EventoDTO altaEventos(@RequestBody Evento evento) {
        final Evento event = srv.save(evento);
        return adapter.of(event);
    }

}
