package com.example.ventas.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
@Entity
public class Evento {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@ManyToOne
	private Carrito carrito;
	
	private String nombreEvento;
	private double precio;
	
	public Evento() {
		super();
	}
}
