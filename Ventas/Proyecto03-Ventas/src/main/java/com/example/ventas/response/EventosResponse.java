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

	private int id;
	private String nombre;
	private String descripcioncorta;
	private String descripcionextendida;
    private String fechaevento;
    private String horaevento;
	private double precios;
	private String normas;
	private String salanombre;
	private String salaciudad;
	private String saladireccion;
	private String salatiporecinto;
	private int salaaforo;
	private String genre;
	    
	public static EventosResponse of(Evento events) {
    	EventosResponse eventosR = new EventosResponse();
    	eventosR.setId(events.getId());
    	eventosR.setNombre(events.getNombre());
    	eventosR.setDescripcioncorta(events.getDescripcioncorta());
    	eventosR.setDescripcionextendida(events.getDescripcionextendida());
    	eventosR.setFechaevento(events.getFechaevento());
    	eventosR.setHoraevento(events.getHoraevento());
    	eventosR.setPrecios(events.getPrecios());
    	eventosR.setNormas(events.getNormas());
    	eventosR.setSalanombre(events.getSalanombre());
    	eventosR.setSalaciudad(events.getSalaciudad());
    	eventosR.setSaladireccion(events.getSaladireccion());
    	eventosR.setSalatiporecinto(events.getSalatiporecinto());
    	eventosR.setSalaaforo(events.getSalaaforo());
    	eventosR.setGenre(events.getGenre());
    	return eventosR;
	}
	public static List<EventosResponse> of(List<Evento> events){
		return events.stream()
				.map(e -> of(e))
				.collect(Collectors.toList());
	}
}
