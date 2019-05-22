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
	public List<Libro> findAllByAuthor(String autor) throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("select * from public.libro where autor LIKE CONCAT('%',?,'%')");
		Query query = entityManager.createNativeQuery(sb.toString(), Libro.class);
		query.setParameter(1, autor);
		return query.getResultList();
	}

	@Override
	public List<Libro> findAllByISBN(String ISBN) throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT * FROM public.libro WHERE isbn LIKE CONCAT('%',?,'%')");
		Query query = entityManager.createNativeQuery(sb.toString(), Libro.class);
		query.setParameter(1, ISBN);
		return query.getResultList();
	}

	@Override
	public List<Libro> findAllByGenero(String genero) throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT * FROM public.libro WHERE genero LIKE CONCAT('%',?,'%')");
		Query query = entityManager.createNativeQuery(sb.toString(), Libro.class);
		query.setParameter(1, genero);
		return query.getResultList();
	}

}
