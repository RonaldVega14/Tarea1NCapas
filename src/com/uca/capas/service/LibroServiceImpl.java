package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.dao.LibroDAO;
import com.uca.capas.domain.Libro;

@Service
public class LibroServiceImpl implements LibroService {

	@Autowired
	private LibroDAO libroDao;

	@Override
	public List<Libro> findAll() throws DataAccessException {
		return libroDao.findAll();
	}

	@Override
	public List<Libro> findAllByAuthor(String autor) throws DataAccessException {
		return libroDao.findAllByAuthor(autor);
	}

	@Override
	public List<Libro> findAllByISBN(String isbn) throws DataAccessException {
		return libroDao.findAllByISBN(isbn);
	}

	@Override
	public List<Libro> findAllByGenero(String genero) throws DataAccessException {
		return libroDao.findAllByGenero(genero);
	}

}
