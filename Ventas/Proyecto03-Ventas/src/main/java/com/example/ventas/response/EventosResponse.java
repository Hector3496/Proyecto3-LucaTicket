package com.example.ventas.response;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.ventas.model.Evento;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component
public class EventosResponse {

	private static final long serialVersionUID = 1L;
	private int id;
	private String nombreEvento;
	private double precio;
	    
	public static EventosResponse of(Evento events) {
    	EventosResponse eventosR = new EventosResponse();
    	eventosR.setId(events.getId());
    	eventosR.setNombreEvento(events.getNombreEvento());
    	eventosR.setPrecio(events.getPrecio());
    	return eventosR;
	}
	public static List<EventosResponse> of(List<Evento> events){
		return events.stream()
				.map(e -> of(e))
				.collect(Collectors.toList());
	}
}
