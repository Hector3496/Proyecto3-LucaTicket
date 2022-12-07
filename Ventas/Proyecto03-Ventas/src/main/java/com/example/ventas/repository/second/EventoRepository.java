package com.example.ventas.repository.second;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.ventas.model.Evento;

/*Interface para realizar la llamada a metodos incluidos por defecto en la clase interna de MongoRepository*/
public interface EventoRepository extends MongoRepository<Evento, Integer> {
	
}