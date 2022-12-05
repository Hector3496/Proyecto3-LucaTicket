package com.example.eventos.model;

/**
 * @author Raul
 */

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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
	private int id;
	private String Nombre;
	private String DescripcionCorta;
	private String DescripcionExtendida;
    private Date FechaEvento;
    private Date HoraEvento;
	private double Precios;
	private String Normas;
	private String SalaNombre;
	private String SalaCiudad;
	private String SalaDireccion;
	private String SalaRecinto;
	private int SalaAforo;

	
}
