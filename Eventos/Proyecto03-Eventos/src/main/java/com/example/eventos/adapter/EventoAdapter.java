package com.example.eventos.adapter;

import com.example.eventos.model.Evento;
import com.example.eventos.response.EventoDTO;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class EventoAdapter {
/* Metodo para realizar la conversion de la entity Evento a la clase a mostrar EventoDTO*/
	public EventoDTO of(Evento evento) {
		EventoDTO eventoDTO = new EventoDTO();
		eventoDTO.setId(evento.getId());
		eventoDTO.setNombre(evento.getNombre());
		eventoDTO.setDescripcioncorta(evento.getDescripcioncorta());
		eventoDTO.setDescripcionextendida(evento.getDescripcionextendida());
    	eventoDTO.setFechaevento(evento.getFechaevento());
    	eventoDTO.setHoraevento(evento.getHoraevento());
    	eventoDTO.setPrecios(evento.getPrecios());
    	eventoDTO.setNormas(evento.getNormas());
    	eventoDTO.setSalanombre(evento.getSalanombre());
    	eventoDTO.setSalaciudad(evento.getSalaciudad());
    	eventoDTO.setSaladireccion(evento.getSaladireccion());
    	eventoDTO.setSalatiporecinto(evento.getSalatiporecinto());
    	eventoDTO.setSalaaforo(evento.getSalaaforo());
    	eventoDTO.setGenre(evento.getGenre());

		return eventoDTO;
	}
	
/* Metodo para realizar la conversion de una lista de entity Evento a una lista a mostrar de EventoDTO*/
	public List<EventoDTO> of(List<Evento> eventos){
		return eventos.stream()
				.map(e -> of(e))
				.collect(Collectors.toList());
	}	
}
