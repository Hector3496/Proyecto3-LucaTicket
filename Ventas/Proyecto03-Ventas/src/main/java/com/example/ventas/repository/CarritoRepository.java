package com.example.ventas.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ventas.model.Carrito;

public interface CarritoRepository extends JpaRepository<Carrito, Integer> {

}
