package com.example.eventos.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.eventos.model.Evento;

/*Interface para realizar la llamada a metodos incluidos por defecto en la clase interna de JpaRepository*/
public interface EventoRepository extends MongoRepository<Evento, Integer> {
}
