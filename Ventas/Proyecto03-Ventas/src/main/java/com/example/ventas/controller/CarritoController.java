package com.example.ventas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ventas.repository.CarritoRepository;
import com.example.ventas.response.CarritoResponse;
import com.example.ventas.service.CarritoServiceImpl;

@RestController
@RequestMapping("/carrito")
public class CarritoController {

	@Autowired
	private CarritoRepository carritoRepo;
	
	@Autowired
	private CarritoServiceImpl carritoSrv;
	
	@GetMapping("/readCarritos")
    public List<CarritoResponse> readCarritos() {
    	//La adaptacion (paso a DTO) se hace en esta capa de control; no en Service o repo
        return CarritoResponse.of(carritoRepo.findAll());
    }
	
	@GetMapping("/{id}")
    public CarritoResponse getCarrito(@PathVariable int id) {
    	//La adaptacion (paso a DTO) se hace en esta capa de control; no en Service o repo
        return CarritoResponse.of(carritoRepo.findById(id).orElseThrow());
    }
	@PostMapping("/addCarrito/{id}")
    public void addCarrito(@PathVariable int id, @RequestParam int id_Evento, @RequestParam(defaultValue = "1") Integer qt) {
		carritoSrv.addCarrito(id, id_Evento, qt);
    }
}
