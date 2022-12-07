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

@Getter
@Setter
@ToString

@Entity
@Table(name="usuarios")
public class Usuarios {
	
	@ManyToOne
    @JoinColumn(name = "id_Usuario")
	private int idUsuario;
	
	@OneToMany
    private List<Eventos> eventos;

	public Usuarios() {
		super();
	}
}
