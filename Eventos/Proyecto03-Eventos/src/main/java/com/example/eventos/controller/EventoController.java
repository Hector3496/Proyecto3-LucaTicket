package com.example.eventos.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.eventos.adapter.EventoAdapter;
import com.example.eventos.model.Evento;
import com.example.eventos.response.EventoDTO;
import com.example.eventos.services.EventoService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/eventos")
@Tag(name = "eventos", description = "the Eventos API")
public class EventoController {

    private static final Logger log = LoggerFactory.getLogger(EventoController.class);
    
    @Autowired
    private EventoService srv;
    
    @Autowired
	private EventoAdapter adapter;
    
    /*Metodo para mostrar el listado (GET) de los eventos, desde la base de datos, en servicio rest*/
	@GetMapping("/readEventos")
	public List<EventoDTO> readEventos(){
		final List<Evento> events = srv.findGenre();
		return adapter.of(events);
	}
    /*Metodo para añadir un evento a la base de datos,desde servicio rest*/
    @PostMapping("/addEvento")
    public EventoDTO altaEventos(@RequestBody Evento evento) {
        final Evento event = srv.save(evento);
        return adapter.of(event);
    }
    
	}@GetMapping("/byName/{genero}")
    public List<EventoDTO> findByGenre(@PathVariable String genero){
        final List<Evento> events = srv.findByGenre(genero);
        return adapter.of(events);
    }
    

}
