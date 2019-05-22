package com.uca.capas.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Libro;

public interface LibroDAO {

	public List<Libro> findAll() throws DataAccessException;

	public List<Libro> findAllByAuthor(String autor) throws DataAccessException;

	public List<Libro> findAllByISBN(String ISBN) throws DataAccessException;

	public List<Libro> findAllByGenero(String genero) throws DataAccessException;

}
