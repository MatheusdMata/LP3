package com.projeto.senac.Enum;

public enum Curso {

	MARKETING ("Marketing"),
	ADMINISTRACAO ("Adminstracao"),
	ADS ("ADS"),
	CONTABILIDADE ("Contabilidade"),
	ENFERMAGEM ("Enfermagem"); 
	
	private String curso;
	private Curso(String curso) {
		this.curso=curso;
	}
	
}
