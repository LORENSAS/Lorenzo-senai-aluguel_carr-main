package com.LorenzoLocacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.LorenzoLocacao.models.Cliente;
import com.LorenzoLocacao.repository.ClienteRepository;

@Controller
public class ClienteController {
	
	@Autowired
	private ClienteRepository clr;

	@RequestMapping(value = "/cadastrarCliente", method = RequestMethod.GET)
	public String cadastrarCliente() {
		return "cliente/formCadastrarCliente";
	}

	@RequestMapping(value = "/cadastrarCliente", method = RequestMethod.POST)
	public String cadastrarCliente(Cliente cliente) {
		clr.save(cliente);
		return "redirect:/clientes";
	}
	
	@RequestMapping("/clientes")
	public ModelAndView listaClientes() {
	ModelAndView mv = new ModelAndView("cliente/clientes");
	Iterable<Cliente> clientes = clr.findAll();
	mv.addObject("clientes", clientes);
	return mv;
	}
	
	@RequestMapping("/deletarCliente")
	public String deletarCliente(@RequestParam("codigo") long codigo) {
		Cliente cliente = clr.findByCodigo(codigo);
		clr.delete(cliente);
		return "redirect:/clientes";		
	}
	
	@RequestMapping(value = "/editarCliente", method = RequestMethod.GET)
	public ModelAndView editarEvento(@ModelAttribute("codigo") long codigo) {
		Cliente cliente = clr.findByCodigo(codigo);		
		ModelAndView m = new ModelAndView();
		m.setViewName("/cliente/formEditarCliente");
		m.addObject("cliente", cliente);
		return m;	
	}
	
	@RequestMapping(value = "/visualizarCliente", method = RequestMethod.GET)
	public ModelAndView visualizarCliente(@ModelAttribute("codigo") long codigo) {
		Cliente cliente = clr.findByCodigo(codigo);
		ModelAndView m = new ModelAndView();
		m.setViewName("/cliente/formVisualizarCliente");
		m.addObject("cliente", cliente);
		return m;
	}

}
