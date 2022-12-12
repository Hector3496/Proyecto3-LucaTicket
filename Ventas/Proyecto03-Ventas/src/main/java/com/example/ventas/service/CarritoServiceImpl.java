package com.example.ventas.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.ventas.controller.CarritoController;
import com.example.ventas.controller.error.UsuarioNotFoundException;
import com.example.ventas.model.Carrito;
import com.example.ventas.model.Evento;
import com.example.ventas.model.Usuario;
import com.example.ventas.repository.CarritoRepository;
import com.example.ventas.response.CarritoResponse;
import com.example.ventas.response.EventosResponse;
@Service
public class CarritoServiceImpl {

	private static final Logger log = LoggerFactory.getLogger(CarritoController.class);

	@Autowired
	private CarritoRepository carritoRepo;
	
	/*@Autowired
	private EventoRepository eventosRepo;
	
	@Autowired
	private UsuarioRepository usuarioRepo;*/
	
	@Autowired
	RestTemplate restTemplate;
	
	public void addCarrito(int id, int idUser, int idEvent, Integer qt) {
		final EventosResponse event = restTemplate.getForObject("http://eventos/eventos/" + idEvent, EventosResponse.class);
		log.info(" ------------- Evento: " + event.toString());
		this.addCarrito(id, idUser, idEvent, event, qt);
	}

	private void addCarrito(int id, int idUser, int idEvent, EventosResponse evento, Integer qt) {
		Carrito carrit = new Carrito();
		//carrit.setId(id);
		carrit.setFechacompra(Date.valueOf("2022-01-01"));
		carrit.setIdusuario(idUser);
		carrit.setIdevento(idEvent);
		log.info(" ------- CARRITO ------- " + carrit.toString());
		this.carritoRepo.save(carrit);
	}

	public List<Carrito> findAll() {
		return carritoRepo.findAll();
	}

	public Carrito save(Carrito carrito) {
		return carritoRepo.save(carrito);
	}
	public Optional<Carrito> findById(int id){
		return carritoRepo.findById(id);
	}

}
