package br.com.pilares.msteste.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pilares.msteste.service.TesteService;

@RestController
@RequestMapping("/teste")
public class TesteController {
	
	private TesteService testeService;
	
	@Autowired
	public TesteController(TesteService testeService) {
		this.testeService = testeService;
	}
	
	@GetMapping
	public String teste() {
		return testeService.teste();
	}

}
