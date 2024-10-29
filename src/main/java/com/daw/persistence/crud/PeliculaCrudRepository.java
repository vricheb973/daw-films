package com.daw.persistence.crud;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.daw.persistence.entities.Genero;
import com.daw.persistence.entities.Pelicula;
															   
public interface PeliculaCrudRepository extends CrudRepository<Pelicula, Integer> {
	
	//SELECT * FROM pelicula WHERE genero = ?
	List<Pelicula> findByGenero(Genero genero);
	
	//SELECT * FROM pelicula WHERE puntuacion BETWEEN ?1 and ?2
	List<Pelicula> findByPuntuacionBetween(double min, double max);
	

}
