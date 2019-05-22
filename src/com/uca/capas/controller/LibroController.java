package com.uca.capas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Libro;
import com.uca.capas.service.LibroService;

@Controller
public class LibroController {

	@Autowired
	private LibroService libroService;

	@RequestMapping("/buscarTodos")
	public ModelAndView findAll() {
		ModelAndView mav = new ModelAndView();
		List<Libro> libros = null;
		try {
			libros = libroService.findAll();
		} catch (Exception e) {

		}

		mav.addObject("libros", libros);
		mav.setViewName("todos");
		return mav;
	}

	@RequestMapping("/buscarLibro")
	public ModelAndView buscarTexto(@RequestParam(name = "filtro") String s,
			@RequestParam(name = "idCategory") int select) {
		ModelAndView mav = new ModelAndView();
		StringBuffer sb = new StringBuffer();
		String x = null;
		sb.append("Se encontraron ");
		List<Libro> libros = null;
		switch (select) {
		case 0:
			break;
		case 3:
			libros = libroService.findAllByAuthor(s);
			x = "autor";
			break;
		case 2:
			libros = libroService.findAllByISBN(s);
			x = "ISBN";
			break;
		case 4:
			libros = libroService.findAllByGenero(s);
			x = "genero";
			break;
		default:
			libros = libroService.findAll();
			x = "todo";
			break;
		}

		sb.append(x);
		mav.addObject("libros", libros);
		mav.addObject("criterio", x);
		mav.addObject("nLibros", libros.size());
		mav.addObject("buscado", s);
		mav.setViewName("busqueda");
		return mav;
	}

}
