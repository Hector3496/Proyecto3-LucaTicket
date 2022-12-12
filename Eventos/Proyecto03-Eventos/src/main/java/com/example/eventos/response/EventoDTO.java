package com.example.eventos.response;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*Clase EventoDTO que se va a mostrar en servicio rest en lugar de Evento
la cual es para rellenar la base de datos*/
@Getter
@Setter
@ToString
public class EventoDTO {

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
    
    public EventoDTO() {
        super();
        // TODO Auto-generated constructor stub
    }
}