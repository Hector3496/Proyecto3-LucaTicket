package com.example.eventos.repository;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


import com.example.eventos.model.Evento;

/*Interface para realizar la llamada a metodos incluidos por defecto en la clase interna de JpaRepository*/
public interface EventoRepository extends MongoRepository<Evento, Integer> {

	//Query para el metodo mostrar los eventos por un genero
	@Query(value = "{genre:?0}")
	List<Evento> findByGenre(String genero);
	
	//Query para el metodo mostrar un evento por nombre en la base de datos
	@Query("{nombre:?0}")
	List<Evento> findByNombre(String nombre);
	
	//Query para el metodo mostrar los eventos de una ciudad
	@Query("{salaCiudad:?0}")
	List<Evento> findByCiudad(String ciudad);

}
