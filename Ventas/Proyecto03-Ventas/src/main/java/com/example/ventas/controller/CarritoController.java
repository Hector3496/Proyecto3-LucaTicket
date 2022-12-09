package com.example.ventas.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.ventas.controller.error.CarritoNoContentException;
import com.example.ventas.controller.error.CarritoNotFoundException;
import com.example.ventas.model.Carrito;
import com.example.ventas.repository.CarritoRepository;
import com.example.ventas.response.CarritoResponse;
import com.example.ventas.service.CarritoServiceImpl;

@RestController
@RequestMapping("/carrito")
public class CarritoController {

	private static final Logger log = LoggerFactory.getLogger(CarritoController.class);

	@Autowired
	private CarritoRepository carritoRepo;
	
	@Autowired
	private CarritoServiceImpl carritoSrv;
	
	@GetMapping("/readCarritos")
    public List<CarritoResponse> readCarritos() {
    	//La adaptacion (paso a DTO) se hace en esta capa de control; no en Service o repo
        //return carritoSrv.findAll().orElseThrow(CarritoNoContentException::new);
        return Optional.of(CarritoResponse.of(carritoRepo.findAll())).orElseThrow(CarritoNoContentException::new);
    }
	
	@GetMapping("/{id}")
    public CarritoResponse getCarrito(@PathVariable int id) {
    	//La adaptacion (paso a DTO) se hace en esta capa de control; no en Service o repo
        return CarritoResponse.of(carritoRepo.findById(id).orElseThrow(CarritoNotFoundException::new));
    }
	@PostMapping("/addCarrito/{id}/{id_Evento}")
    public void addCarrito(@PathVariable int id, @RequestParam int id_Evento, @RequestParam(defaultValue = "1") Integer qt) {
		carritoSrv.addCarrito(id, id_Evento, qt);
    }
	@PostMapping("/addCarrito/")
	public Carrito addCarrito(@Valid @RequestBody Carrito carrito) {
			
		log.info("------ addCarrito (POST)");
		Carrito result = this.carritoSrv.save(carrito);
		log.info("------ Dato Guardado " + result);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(result.getId())
				.toUri();
		
		return result;
	}
}
