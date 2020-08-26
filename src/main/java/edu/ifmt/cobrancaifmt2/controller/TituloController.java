package edu.ifmt.cobrancaifmt2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Anotação que controla o Spring
public class TituloController {
	
	@RequestMapping("/titulos/novo") //mapeamento da url.
	public String novo() {		
		//Metodo que retorna uma String com o nome da Viw..  
		return "CadastroTitulo";
	}
	
}
