package com.example.demo.controller.error;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Susana Diaz
 */

/*
 * clase similar a la de errores, pero con cambios en fecha y campo añadido
 */

@Getter
@Setter
@ToString
public class CustomErrorJson {

	/*
	 * atributos de JSon
	 */
	private String timestamp;
	private int status;
	private String error;
	private List<String> message;
	private String author;

	/*
	 * atributos de JSon extras
	 */
	private String infoadicional;	

	public CustomErrorJson() {
		super();
		this.timestamp = "";
		this.status = 0;
		this.error = "";
		this.message = new ArrayList<>();
		this.author = "Susana Díaz";		
	}

	public CustomErrorJson(Date timestamp, int status, String error, List<String> message, String author,
			String infoadicional) {
		super();
		/*
		 * formato dd/MM/yyyy
		 */
		this.timestamp = this.changeTimeStamp(timestamp);
		this.status = status;
		this.error = error;
		this.message = message;
		this.author = "Susana Díaz";		
	}
	
	/*
	 * variacion setTimestamp
	 * @param Date en lugar de String 
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = this.changeTimeStamp(timestamp);
	}	

	private String changeTimeStamp(Date d) {
		/*
		 * formato España, para que aparezca la fecha formateada como dia/mes/año y la hora como hora/min/seg
		 */
		final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		/*
		 * formatear y actualizar marca de tiempo
		 */
		return dateFormat.format(d);
	}
}
