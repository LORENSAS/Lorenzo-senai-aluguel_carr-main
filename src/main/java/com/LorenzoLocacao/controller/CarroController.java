package com.LorenzoLocacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.LorenzoLocacao.models.Carro;
import com.LorenzoLocacao.repository.CarroRepository;

@Controller
public class CarroController {
	@Autowired
	private CarroRepository cr;

	@RequestMapping(value = "/cadastrarCarro", method = RequestMethod.GET)
	public String cadastrarCarro() {
		return "carro/formCadastrarCarro";
	}

	@RequestMapping(value = "/cadastrarCarro", method = RequestMethod.POST)
	public String cadastrarCarro(Carro carro) {
		cr.save(carro);
		return "redirect:/carros";
	}

	@RequestMapping("/carros")
	public ModelAndView listaCarros() {
		ModelAndView mv = new ModelAndView("carro/carros");
		Iterable<Carro> carros = cr.findAll();
		mv.addObject("carros", carros);
		return mv;
	}
	
	@RequestMapping("/deletarCarro")
	public String deletarCarro(@RequestParam("codigo") long codigo) {
		Carro carro = cr.findByCodigo(codigo);
		cr.delete(carro);
		return "redirect:/carros";		
	}
	
	@RequestMapping(value = "/editarCarro", method = RequestMethod.GET)
	public ModelAndView editarCarro(@ModelAttribute("codigo") long codigo) {
		Carro carro = cr.findByCodigo(codigo);		
		ModelAndView m = new ModelAndView();
		m.setViewName("/carro/formEditarCarro");
		m.addObject("carro", carro);
		return m;	
	}
	
	@RequestMapping(value = "/visualizarCarro", method = RequestMethod.GET)
	public ModelAndView visualizarCarro(@ModelAttribute("codigo") long codigo) {
		Carro carro = cr.findByCodigo(codigo);		
		ModelAndView m = new ModelAndView();
		m.setViewName("/carro/formVisualizarCarro");
		m.addObject("carro", carro);
		return m;
	}

}
