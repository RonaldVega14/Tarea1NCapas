package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Libro;

public class LibroServiceImpl implements LibroService {

	@Autowired
	private LibroService libroService;

	@Override
	public List<Libro> findAll() throws DataAccessException {
		return libroService.findAll();
	}

	@Override
	public List<Libro> findAllByAuthor() throws DataAccessException {
		return libroService.findAllByAuthor();
	}

	@Override
	public List<Libro> findAllByISBN() throws DataAccessException {
		return libroService.findAllByISBN();
	}

	@Override
	public List<Libro> findAllByGenero() throws DataAccessException {
		return libroService.findAllByGenero();
	}

}
