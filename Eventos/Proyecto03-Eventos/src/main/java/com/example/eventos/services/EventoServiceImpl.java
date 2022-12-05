package com.example.eventos.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
/**
 * @author Hector
 */
import org.springframework.stereotype.Service;

import com.example.eventos.model.Evento;
import com.example.eventos.repository.EventoRepository;

@Service
public class EventoServiceImpl implements EventoService {

	@Autowired
	private EventoRepository repo;
	
	@Override
	public Evento save(Evento evento) {
		return repo.save(evento);
	}

	@Override
	public List<Evento> findall() {
		return repo.findAll();
	}

}
