package com.LorenzoLocacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.LorenzoLocacao.models.Agencia;
import com.LorenzoLocacao.repository.AgenciaRepository;

@Controller
public class AgenciaController {
	@Autowired
	private AgenciaRepository ar;

	@RequestMapping(value = "/cadastrarAgencia", method = RequestMethod.GET)
	public String cadastrarAgencia() {
		return "agencia/formCadastrarAgencia";
	}

	@RequestMapping(value = "/cadastrarAgencia", method = RequestMethod.POST)
	public String cadastrarAgencia(Agencia agencia) {
		ar.save(agencia);
		
		return "redirect:/agencias";
	}
	

	@RequestMapping("/agencias")
	public ModelAndView listaAgencias() {
		ModelAndView mv = new ModelAndView("agencia/agencias");
		Iterable<Agencia> agencias = ar.findAll();
		mv.addObject("agencias", agencias);
		return mv;
		
	}
	
	@RequestMapping("/deletarAgencia")
	public String deletarAgencia(@RequestParam("codigo") long codigo) {
		Agencia agencia = ar.findByCodigo(codigo);
		ar.delete(agencia);
		return "redirect:/agencias";		
	}
	
	@RequestMapping(value = "/editarAgencia", method = RequestMethod.GET)
	public ModelAndView editarAgencia(@ModelAttribute("codigo") long codigo) {
		Agencia agencia = ar.findByCodigo(codigo);		
		ModelAndView m = new ModelAndView();
		m.setViewName("/agencia/formEditarAgencia");
		m.addObject("agencia", agencia);
		return m;	
	}
	
	@RequestMapping(value = "/visualizarAgencia", method = RequestMethod.GET)
	public ModelAndView visualizarAgencia(@ModelAttribute("codigo") long codigo) {
		Agencia agencia = ar.findByCodigo(codigo);		
		ModelAndView m = new ModelAndView();
		m.setViewName("/agencia/formVisualizarAgencia");
		m.addObject("agencia", agencia);
		return m;	
	}

}
