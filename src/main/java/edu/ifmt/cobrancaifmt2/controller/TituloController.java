package edu.ifmt.cobrancaifmt2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.ifmt.cobrancaifmt2.model.Titulo;

@Controller // Anotação que controla o Spring
@RequestMapping("/titulos") // O mapeamento do titulo fica em todo o controlle
public class TituloController {

	@RequestMapping("/novo") // mapeamento da url.
	public String novo() { // Metodo que retorna uma String com o nome da View
		return "CadastroTitulo";
	}

	@RequestMapping(method = RequestMethod.POST)
	public void salvar(Titulo titulo) {
			
	}
}
