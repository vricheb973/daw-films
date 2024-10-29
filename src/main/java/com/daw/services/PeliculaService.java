package com.daw.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daw.persistence.crud.PeliculaCrudRepository;
import com.daw.persistence.entities.Genero;
import com.daw.persistence.entities.Pelicula;

@Service
public class PeliculaService {
	
	@Autowired
	private PeliculaCrudRepository peliculaCrudRepository;
	
	public List<Pelicula> getAll() {
		return (List<Pelicula>) this.peliculaCrudRepository.findAll();
	}
	
	public Optional<Pelicula> getPelicula(int idPelicula){
		return this.peliculaCrudRepository.findById(idPelicula);
	}

	public List<Pelicula> getComedias() {
		return this.peliculaCrudRepository.findByGenero(Genero.COMEDIA);
	}
	
	public List<Pelicula> getByPuntuacion(double min, double max) {
		return this.peliculaCrudRepository.findByPuntuacionBetween(min, max);
	}

}
