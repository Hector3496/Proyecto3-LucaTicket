package com.example.ventas.model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name="Carrito")
public class Carrito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JoinColumn(name="id_Product")
	private int idProduct;
	
	@ManyToOne
	private Eventos eventos;
	
	@OneToMany
	private Usuarios usuarios;
	
	@JoinColumn(name="Fecha_Compra")
	private Date fechaCompra;

	//@OneToMany(mappedBy = "carrito")
    //List<Carrito> products;
	
}
