package com.uca.capas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Libro;
import com.uca.capas.service.LibroService;

@Controller
public class MainController {

	@Autowired
	private LibroService libroService;

	@RequestMapping("/")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		return mav;
	}

	@RequestMapping("/all")
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

}
