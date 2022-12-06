package com.example.eventos.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.eventos.model.Evento;

/*Interface para realizar la llamada a metodos incluidos por defecto en la clase interna de JpaRepository*/
public interface EventoRepository extends MongoRepository<Evento, Integer> {
	@Query(value = "db.eventos.find({genre: \"?1\"})")
	List<Evento> findByGenre(String genero);
}
