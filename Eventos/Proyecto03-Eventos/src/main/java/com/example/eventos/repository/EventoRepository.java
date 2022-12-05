package com.example.eventos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eventos.model.Evento;

/*Interface para realizar la llamada a metodos incluidos por defecto en la clase interna de JpaRepository*/
public interface EventoRepository extends JpaRepository<Evento, Integer> {
}
