package com.example.ventas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name="eventos")
public class Eventos {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEvento;

	public Eventos() {
		super();
	}
}
