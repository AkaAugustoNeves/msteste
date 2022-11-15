package br.com.pilares.msteste.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TesteService {

	@Value("${teste}")
	private String teste;
	
	public String teste() {
		return teste;
	}
	
}
