package com.daw.persistence.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pelicula")
public class Pelicula {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titulo;
	
	@Enumerated(EnumType.STRING)
	private Genero genero;
	private String director;
	
	@Column(name = "fecha_estreno")
	private LocalDateTime fechaEstreno;
	private Integer duracion;
	private Double puntuacion;
	private String comentarios;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public LocalDateTime getFechaEstreno() {
		return fechaEstreno;
	}
	public void setFechaEstreno(LocalDateTime fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}
	public Integer getDuracion() {
		return duracion;
	}
	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}
	public Double getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(Double puntuacion) {
		this.puntuacion = puntuacion;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	
}
