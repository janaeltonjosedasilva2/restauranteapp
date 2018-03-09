/*
 * Este controller se refere ao cadastro de restaurantes
 * */

package com.restauranteapp.restauranteapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.restauranteapp.repository.RestauranteInterface;
import com.restauranteapp.restauranteapp.models.Evento;

@Controller
public class EventoController {
	
	@Autowired
	private RestauranteInterface rr;
	
	@RequestMapping(value="/cadastrarRestaurante", method=RequestMethod.GET)
	public String form() {
		return "evento/formEvento";
	}
	
	@RequestMapping(value="/cadastrarRestaurante", method=RequestMethod.POST)
	public String form(Evento restaurante) {
		rr.save(restaurante);
		return "redirect:/cadastrarRestaurante";
	}
	
	@RequestMapping("/restaurantes")
	public ModelAndView listaRestaurantes() {
		ModelAndView mv = new ModelAndView ("index");
		Iterable<Evento> restaurantes = rr.findAll();
		mv.addObject("restaurantes", restaurantes);
		return mv;
	}
}
