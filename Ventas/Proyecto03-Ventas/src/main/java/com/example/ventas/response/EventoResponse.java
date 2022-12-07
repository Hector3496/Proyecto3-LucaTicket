package com.example.ventas.response;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.ventas.model.Eventos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Component
public class EventoResponse {

	/*
	 * Atributos Eventos
	 */	
	private int idEvento;
	private String nombre;
	private String descripcionCorta;
	private String descripcionExtendida;
    private String fechaEvento;
    private String horaEvento;
	private double precios;
	private String normas;
	private String salaNombre;
	private String salaCiudad;
	private String salaDireccion;
	private String salaTipoRecinto;
	private int salaAforo;
	private String genre;
	
	/*
	 * Metodo para realizar la conversion de la entidad Evento
	 */
	public EventoResponse of(Eventos eventos) {
		EventoResponse eventoResponse = new EventoResponse();
		eventoResponse.setIdEvento(eventos.getIdEvento());
		return eventoResponse;
	}
	
	/*
	 * Metodo para realizar la conversion de una lista de entidad Evento a una lista
	 */
	public List<EventoResponse> of(List<Eventos> eventos){
		return eventos.stream()
				.map(e -> of(e))
				.collect(Collectors.toList());
	}	
}
