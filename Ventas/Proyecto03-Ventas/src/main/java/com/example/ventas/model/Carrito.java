package com.example.ventas.model;

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

import java.util.Date;
import java.util.List;


@Getter
@Setter
@ToString
@Entity
@Table(name="carritos")
public class Carrito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
		
	@OneToMany(mappedBy = "carrito")
	private List<Evento> events;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuarios;
	
	@JoinColumn(name="fecha_Compra")
	private Date fecha_Compra;
	
	@JoinColumn(name="validacion")
	private int validacion;

	//@OneToMany(mappedBy = "carrito")
    //List<Carrito> products;
	
	public void setValidacion(int validacion) {
		this.validacion = (int)(Math.random()*4+1);
	}
	
}
