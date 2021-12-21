package com.LorenzoLocacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.LorenzoLocacao.models.Moto;
import com.LorenzoLocacao.repository.MotoRepository;

@Controller
public class MotoController {
	@Autowired
	private MotoRepository mr;

	@RequestMapping(value = "/cadastrarMoto", method = RequestMethod.GET)
	public String cadastrarCarro() {
		return "moto/formCadastrarMoto";
	}

	@RequestMapping(value = "/cadastrarMoto", method = RequestMethod.POST)
	public String cadastrarMoto(Moto moto) {
		mr.save(moto);
		return "redirect:/motos";
	}
	
	@RequestMapping("/motos")
	public ModelAndView listaMotos() {
		ModelAndView mv = new ModelAndView("moto/motos");
		Iterable<Moto> motos = mr.findAll();
		mv.addObject("motos", motos);
		return mv;		
	}
	
	@RequestMapping("/deletarMoto")
	public String deletarMoto(@RequestParam("codigo") long codigo) {
		Moto moto = mr.findByCodigo(codigo);
		mr.delete(moto);
		return "redirect:/motos";		
	}
	
	@RequestMapping(value = "/editarMoto", method = RequestMethod.GET)
	public ModelAndView editarMoto(@ModelAttribute("codigo") long codigo) {
		Moto moto = mr.findByCodigo(codigo);		
		ModelAndView m = new ModelAndView();
		m.setViewName("/moto/formEditarMoto");
		m.addObject("moto", moto);
		return m;	
	}
	
	@RequestMapping(value = "/visualizarMoto", method = RequestMethod.GET)
	public ModelAndView visualizarMoto(@ModelAttribute("codigo") long codigo) {
		Moto moto = mr.findByCodigo(codigo);
		ModelAndView m = new ModelAndView();
		m.setViewName("/moto/formVisualizarMoto");
		m.addObject("moto", moto);
		return m;
	}

}
