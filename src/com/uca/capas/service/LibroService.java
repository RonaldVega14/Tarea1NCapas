package com.uca.capas.service;

import java.util.List;

import com.uca.capas.domain.Libro;

public interface LibroService {

	public List<Libro> findAll();

	public List<Libro> findAllByAuthor(String autor);

	public List<Libro> findAllByISBN(String s);

	public List<Libro> findAllByGenero(String genero);

}
