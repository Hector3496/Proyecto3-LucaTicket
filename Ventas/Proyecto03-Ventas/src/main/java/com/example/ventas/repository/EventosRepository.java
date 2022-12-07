package com.example.ventas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.example.ventas.model.Eventos;

/*Interface para realizar la llamada a metodos incluidos por defecto en la clase interna de MongoRepository*/
public interface EventosRepository extends MongoRepository<Eventos, Integer> {
	
}