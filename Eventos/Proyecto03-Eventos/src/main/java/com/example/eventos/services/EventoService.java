package com.example.eventos.services;

import java.util.List;

import com.example.eventos.model.Evento;

/*Interface EventoService empleada para llamar desde la capa de control 
a la capa repository para conectar los metodos para tratar la informacion*/
public interface EventoService {

	public Evento save(Evento evento);

	public List<Evento> findAll();
	
	public List<Evento> findByGenre(String genero);
}
