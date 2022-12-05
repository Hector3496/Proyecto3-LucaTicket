package com.example.eventos.services;

import java.util.List;

import com.example.eventos.model.Evento;

public interface EventoService {

	public Evento save(Evento evento);

	public List<Evento> findall();
}
