package com.uca.capas.service;

import java.util.List;

import com.uca.capas.domain.Libro;

public interface LibroService {

	public List<Libro> findAll();

	public List<Libro> findAllByAuthor();

	public List<Libro> findAllByISBN();

	public List<Libro> findAllByGenero();

}
