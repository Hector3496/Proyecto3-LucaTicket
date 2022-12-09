package com.example.ventas.response;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.ventas.model.Carrito;
import com.example.ventas.model.Evento;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component
public class CarritoResponse implements Serializable {

	/*
	 * Atributos Eventos
	 */	
	private static final long serialVersionUID = 1L;
	private int id;
    private String usuario;
    private Date fecha_Compra;
    private int validacion;
    private List<EventosResponse> eventos;
	
	/*
	 * Metodo para realizar la conversion de la entidad Evento
	 */
	public static CarritoResponse of(Carrito carrito) {
		CarritoResponse carritoResponse = new CarritoResponse();
		carritoResponse.setId(carrito.getId());
		carritoResponse.setUsuario(carrito.getUsuarios().getNombre());
		carritoResponse.setFecha_Compra(carrito.getFecha_Compra());
		carritoResponse.setEventos(EventosResponse.of(carrito.getEvents()));
		carritoResponse.setValidacion(carrito.getValidacion());
		return carritoResponse;
	}
	
	/*
	 * Metodo para realizar la conversion de una lista de entidad Evento a una lista
	 */
	public static List<CarritoResponse> of(List<Carrito> carritos){
		return carritos.stream()
				.map(e -> of(e))
				.collect(Collectors.toList());
	}	
}
