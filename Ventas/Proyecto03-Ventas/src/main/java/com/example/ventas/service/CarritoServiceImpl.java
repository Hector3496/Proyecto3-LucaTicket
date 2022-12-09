package com.example.ventas.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.ventas.model.Carrito;
import com.example.ventas.model.Evento;
import com.example.ventas.repository.CarritoRepository;
import com.example.ventas.repository.second.EventoRepository;
import com.example.ventas.response.CarritoResponse;
import com.example.ventas.response.EventosResponse;
@Service
public class CarritoServiceImpl {

	@Autowired
	private CarritoRepository carritoRepo;
	
	@Autowired
	private EventoRepository eventosRepo;
	
	@Autowired
	RestTemplate restTemplate;
	
	public void addCarrito(int id, int idEvent, Integer qt) {
		final EventosResponse event = restTemplate.getForObject("http://eventos/eventos/" + idEvent, EventosResponse.class);
		this.addCarrito(id, idEvent, event.getNombreEvento(), event.getPrecio(), qt);
	}

	private void addCarrito(int id, int idEvent, String nombreEvento, double precio, Integer qt) {
		final Carrito carrito = carritoRepo.findById(id).orElseThrow();
		carrito.setValidacion(1);
		for(int i = 0; i < qt; i++) {
			Evento e = new Evento();
			e.setCarrito(carrito);
			e.setId(idEvent);
			e.setNombreEvento(nombreEvento);
			e.setPrecio(precio);
			eventosRepo.save(e);
		}
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
