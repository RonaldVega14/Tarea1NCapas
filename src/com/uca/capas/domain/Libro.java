package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "libro")
public class Libro {

	@Id
	@Column(name = "isbn")
	private Integer isbn;

	@Column(name = "autor")
	private String autor;

	@Column(name = "genero")
	private String genero;

	@Column(name = "cantidad")
	private Integer cantidad;

	@Column(name = "titulo")
	private String titulo;

	public Libro(Integer isbn, String autor, String genero, Integer cantidad, String titulo) {
		super();
		this.isbn = isbn;
		this.autor = autor;
		this.genero = genero;
		this.cantidad = cantidad;
		this.titulo = titulo;
	}

	public Libro() {
		super();
	}

	public Integer getIsbn() {
		return isbn;
	}

	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/*
	 * public String getFechaDelegate() { if(this.bDate == null) return ""; else {
	 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); return
	 * sdf.format(this.bDate.getTime()); } }
	 */

}
