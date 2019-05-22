package com.uca.capas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.dao.StudentDAO;
import com.uca.capas.domain.Student;

@Controller
public class MainController {
	
	@Autowired
	private StudentDAO studentDao;
	
	@RequestMapping("/")
	public ModelAndView initMain(){
		ModelAndView mav = new ModelAndView();
		List<Student> students = null;
		try {
		 students = studentDao.findAll();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		mav.addObject("students",students);
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView insert() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("student", new Student());
		mav.setViewName("form");
		return mav;
	}
	
	@RequestMapping(value="/formData")
	public ModelAndView save(@ModelAttribute Student s) {
		ModelAndView mav = new ModelAndView();
		List<Student> students = null;
		try {
			studentDao.save(s, 1);
		}catch(Exception e) {
			
		}
		students = studentDao.findAll();
		mav.addObject("students", students);
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping("/formStudent")
	public ModelAndView initUser(){
		ModelAndView mav = new ModelAndView();
		Student student = new Student();
		mav.addObject("students",student);
		mav.setViewName("find");
		return mav;
	}
	
	@RequestMapping("/searchStudent")
	public ModelAndView findOne(@RequestParam(value = "cStudent") Integer codigo){
		ModelAndView mav = new ModelAndView();
		Student student = null;
		
		try {
			if(codigo == null) {
				mav.addObject("message", "No hay ningun estudiante registrado con este codigo");
			}else {
				student = studentDao.findOne(codigo);
				mav.addObject("students", student);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		mav.setViewName("search");
		return mav;
	}
	

}
