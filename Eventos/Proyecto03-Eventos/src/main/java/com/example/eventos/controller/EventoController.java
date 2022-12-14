package com.example.eventos.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.eventos.adapter.EventoAdapter;
import com.example.eventos.controller.error.EventoNotFoundException;
import com.example.eventos.model.Evento;
import com.example.eventos.response.EventoDTO;
import com.example.eventos.services.EventoService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/eventos")
@Tag(name = "eventos", description = "the Eventos API")
public class EventoController {

    private static final Logger log = LoggerFactory.getLogger(EventoController.class);
    
    @Autowired
    private EventoService srv;
    
    @Autowired
	private EventoAdapter adapter;
    
    /*Metodo para mostrar el listado (GET) de los eventos, desde la base de datos, en servicio rest*/
	@GetMapping("/readEventos")
	public List<EventoDTO> readEventos(){
		final List<Evento> events = srv.findAll();
		return adapter.of(events);
	}
	
	@GetMapping("/{id}")
	public Evento readEvento(@PathVariable int id) {
		log.info("******** El id: " + id);
		return srv.findById(id).orElseThrow(EventoNotFoundException::new);
	}
	@PutMapping
	public void uploadEvento(@RequestBody Evento event) {
		srv.save(event);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEvento(@PathVariable int id) {
		srv.deleteById(id);
	}
	@GetMapping("/byCiudad/{ciudad}")
	public List<EventoDTO> findByCiudad(@PathVariable String ciudad){
		final List<Evento> events = srv.findByCiudad(ciudad);
		return adapter.of(events);
	}
    /*Metodo para a??adir un evento a la base de datos,desde servicio rest*/
    @PostMapping("/addEvento")
    public EventoDTO altaEventos(@RequestBody Evento evento) {
        final Evento event = srv.save(evento);
        return adapter.of(event);
    }
    

	@GetMapping("/byGenre/{genero}")
    public List<EventoDTO> findByGenre(@PathVariable String genero){
        final List<Evento> events = srv.findByGenre(genero);
        return adapter.of(events);
    }
    


    /*
	 * Metodo altaUsuario() para a??adir un usuario dado y devuelve el recurso
	 */
	@PostMapping("/addEvento/")
	public Evento addEvento(@Valid @RequestBody Evento evento) {
			
		log.info("------ addEvento (POST)");
		Evento result = this.srv.save(evento);
		log.info("------ Dato Guardado " + result);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(result.getId())
				.toUri();
		
		return result;
	}
    
    /*
     * Metodo para mostrar un evento por nombre en la base de datos
     */
    @GetMapping("/byName/{nombre}")
	public List<EventoDTO> findByNombre(@PathVariable String nombre){
    	final List<Evento> events = srv.findByNombre(nombre);
		return adapter.of(events);
	}
}
