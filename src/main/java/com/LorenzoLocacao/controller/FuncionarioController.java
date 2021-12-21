package com.LorenzoLocacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.LorenzoLocacao.models.Funcionario;
import com.LorenzoLocacao.repository.FuncionarioRepository;

@Controller
public class FuncionarioController {

	@Autowired
	private FuncionarioRepository fr;

	@RequestMapping(value = "/cadastrarFuncionario", method = RequestMethod.GET)
	public String cadastrarFuncionario() {
		return "funcionario/formCadastrarFuncionario";
	}

	@RequestMapping(value = "/cadastrarFuncionario", method = RequestMethod.POST)
	public String cadastrarFuncionario(Funcionario funcionario) {
		fr.save(funcionario);
		return "redirect:/funcionarios";
	}

	@RequestMapping("/funcionarios")
	public ModelAndView listaFuncionarios() {
		ModelAndView mv = new ModelAndView("funcionario/funcionarios");
		Iterable<Funcionario> funcionarios = fr.findAll();
		mv.addObject("funcionarios", funcionarios);
		return mv;
	}

	@RequestMapping("/deletarFuncionario")
	public String deletarFuncionario(@RequestParam("codigo") long codigo) {
		Funcionario funcionario = fr.findByCodigo(codigo);
		fr.delete(funcionario);
		return "redirect:/funcionarios";
	}

	@RequestMapping(value = "/editarFuncionario", method = RequestMethod.GET)
	public ModelAndView editarFuncionario(@ModelAttribute("codigo") long codigo) {
		Funcionario funcionario = fr.findByCodigo(codigo);
		ModelAndView m = new ModelAndView();
		m.setViewName("/funcionario/formEditarFuncionario");
		m.addObject("funcionario", funcionario);
		return m;
	}
	
	@RequestMapping(value = "/visualizarFuncionario", method = RequestMethod.GET)
	public ModelAndView visualizarFuncionario(@ModelAttribute("codigo") long codigo) {
		Funcionario funcionario = fr.findByCodigo(codigo);
		ModelAndView m = new ModelAndView();
		m.setViewName("/funcionario/formVisualizarFuncionario");
		m.addObject("funcionario", funcionario);
		return m;
	}

}
