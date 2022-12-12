package com.example.ventas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 * Clase Eventos para definir Entity Eventos con atributo idEvento
 * Metodos Getter, Setter y toString con Lombok
 */

@Getter
@Setter
@ToString
public class Evento {

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
	public Evento() {
		super();
	}
}
