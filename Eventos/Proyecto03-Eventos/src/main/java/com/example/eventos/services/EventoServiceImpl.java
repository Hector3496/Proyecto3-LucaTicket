package com.example.eventos.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
/**
 * @author Hector
 */
import org.springframework.stereotype.Service;

import com.example.eventos.model.Evento;
import com.example.eventos.repository.EventoRepository;
/*Clase service que implementa los metodos de su interfaz para 
realizar las funciones que pasa de capa en capa la interface*/
@Service
public class EventoServiceImpl implements EventoService {

	@Autowired
	private EventoRepository repo;
	
	@Override
	public Evento save(Evento evento) {
		return repo.save(evento);
	}

	@Override
	public List<Evento> findAll() {
		return repo.findAll();
	}
	

	@Override
	public List<Evento> findByGenre(String genero){
		return repo.findByGenre(genero);
	}
	/*
     * Sobreescribir metodo para mostrar un evento por nombre en la base de datos
     */
	@Override
	public List<Evento> findByNombre(String nombre) {
		return repo.findByNombre(nombre);
	}
	@Override
	public void deleteById(int id) {
		repo.deleteById(id);
	}

	@Override
	public Optional<Evento> findById(int id) {
		return repo.findById(id);
	}

	@Override
	public List<Evento> findByCiudad(String ciudad) {
		return repo.findByCiudad(ciudad);
	}

}
