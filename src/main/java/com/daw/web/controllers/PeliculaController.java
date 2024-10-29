package com.daw.web.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.daw.persistence.entities.Pelicula;
import com.daw.services.PeliculaService;

@RestController
@RequestMapping("/peliculas")
public class PeliculaController {
	
	@Autowired
	private PeliculaService peliculaService;
	
	@GetMapping
	public ResponseEntity<List<Pelicula>> list(){
		List<Pelicula> pelis = this.peliculaService.getAll();
		
		return ResponseEntity.ok(pelis);
	}
	
	@GetMapping("/{idPelicula}")
	public ResponseEntity<Pelicula> findOne(@PathVariable("idPelicula") int idPelicula){
		Optional<Pelicula> peli = this.peliculaService.getPelicula(idPelicula);
		
		if(peli.isPresent()) {
			return ResponseEntity.ok(peli.get());
		}
			
		
		return ResponseEntity.notFound().build();
	}
	
	@GetMapping("/comedias")
	public ResponseEntity<List<Pelicula>> comedias(){
		List<Pelicula> pelis = this.peliculaService.getComedias();
		
		return ResponseEntity.ok(pelis);
	}
	
	@GetMapping("/puntuacion")
	public ResponseEntity<List<Pelicula>> puntuacion(@RequestParam("min") double min, @RequestParam("max") double max){
		List<Pelicula> pelis = this.peliculaService.getByPuntuacion(min, max);
		
		return ResponseEntity.ok(pelis);
	}

}
