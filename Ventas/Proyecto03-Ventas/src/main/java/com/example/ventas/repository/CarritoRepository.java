package com.example.ventas.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ventas.model.Carrito;

/*Interface para realizar la llamada a metodos incluidos por defecto en la clase interna de JpaRepository*/
public interface CarritoRepository extends JpaRepository<Carrito, Integer> {

}
