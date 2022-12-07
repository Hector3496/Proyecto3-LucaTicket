package com.example.eventos.adapter;

import com.example.eventos.model.Evento;
import com.example.eventos.response.EventoDTO;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class EventoAdapter {
/* Metodo para realizar la conversion de la entity Evento a la clase a mostrar EventoDTO*/
	public EventoDTO of(Evento evento) {
		EventoDTO eventoDTO = new EventoDTO();
		eventoDTO.setNombre(evento.getNombre());
		eventoDTO.setDescripcionCorta(evento.getDescripcionCorta());
		eventoDTO.setDescripcionExtendida(evento.getDescripcionExtendida());
		eventoDTO.setFechaEvento(evento.getFechaEvento());
		eventoDTO.setHoraEvento(evento.getHoraEvento());
		eventoDTO.setPrecios(evento.getPrecios());
		eventoDTO.setNormas(evento.getNormas());
		eventoDTO.setSalaNombre(evento.getSalaNombre());
		eventoDTO.setSalaCiudad(evento.getSalaCiudad());
		eventoDTO.setSalaDireccion(evento.getSalaDireccion());
		eventoDTO.setSalaTipoRecinto(evento.getSalaTipoRecinto());
		eventoDTO.setSalaAforo(evento.getSalaAforo());
		return eventoDTO;
	}
	
/* Metodo para realizar la conversion de una lista de entity Evento a una lista a mostrar de EventoDTO*/
	public List<EventoDTO> of(List<Evento> eventos){
		return eventos.stream()
				.map(e -> of(e))
				.collect(Collectors.toList());
	}	
}
