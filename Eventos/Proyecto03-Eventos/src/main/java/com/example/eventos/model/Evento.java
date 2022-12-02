package com.example.eventos.model;

/**
 * @author Raul
 */

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;


import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Document(value="eventoDB")
@Getter
@Setter
@ToString

@Entity
/**
 * Creamos la entidad Evento
 * Creamos los atributos de Evento con los metodos getter y setters con Lombok
 *
 */
public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
