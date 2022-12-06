package com.example.eventos.model;

/**
 * @author Raul
 */


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Creamos la entidad Evento
 * Creamos los atributos de Evento con los metodos getter y setters con Lombok
 *
 */
@Document(value="eventoDB")
@Getter
@Setter
@ToString
public class Evento {

	@Id
	@Generated
	private int id;
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

	
}
