package com.uca.capas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.uca.capas.domain.Libro;

@Repository
public class LibroDAOImpl implements LibroDAO {

	@PersistenceContext(unitName = "capas")
	private EntityManager entityManager;

	@Override
	public List<Libro> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("select * from public.libro");
		Query query = entityManager.createNativeQuery(sb.toString(), Libro.class);
		List<Libro> resulset = query.getResultList();
		return resulset;
	}

	@Override
	public List<Libro> findAllByAuthor() throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Libro> findAllByISBN() throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Libro> findAllByGenero() throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

}
