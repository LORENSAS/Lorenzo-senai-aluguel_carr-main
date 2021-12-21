package com.LorenzoLocacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Classe que controla a requisição da raiz para o arquivo index.html
 * @author Widson
 */
@Controller
public class IndexController {
	
	/**
	 * Método que retorna a requisião do usuário para retornar o arquivo index.html quando ele acessar a raiz do projeto
	 * @return index.html
	 */
	@RequestMapping("/")
	public String index() {
		return "index";
	}

}
