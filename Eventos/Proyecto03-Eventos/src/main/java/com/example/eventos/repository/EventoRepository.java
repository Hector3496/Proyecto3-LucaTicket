package com.example.eventos.repository;

import java.util.List;

<<<<<<< HEAD
=======
import org.springframework.data.jpa.repository.Query;
>>>>>>> 1e4790095447084df53c73b45eb608503e18a7b8
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


import com.example.eventos.model.Evento;

/*Interface para realizar la llamada a metodos incluidos por defecto en la clase interna de JpaRepository*/
public interface EventoRepository extends MongoRepository<Evento, Integer> {
<<<<<<< HEAD
	@Query(value = "db.eventos.find({genre: \"?1\"})")
	List<Evento> findByGenre(String genero);
=======
	
	/*
     * Query para el metodo mostrar un evento por nombre en la base de datos
     */
	@Query(value = "db.eventos.find({nombre: \"?1\"})")
	List<Evento> findByNombre(String nombre);
>>>>>>> 1e4790095447084df53c73b45eb608503e18a7b8
}
