package com.example.eventos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eventos.model.Evento;

public interface EventoRepository extends JpaRepository<Evento, Integer> {
}
