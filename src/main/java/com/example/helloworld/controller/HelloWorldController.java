package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

	@RequestMapping("/hello-world")
		public class HelloWorldController {
		@GetMapping
			public String helloWorld() {
				return "Hello World!!!";
		}
		
@RestController	

	@RequestMapping("/bsms")
		public class BsmsController {
		@GetMapping
			public String bsms() {
				return "Persistência\r\n"
						+ "Mentalidade de Crescimento\r\n"
						+ "Orientação ao Futuro\r\n"
						+ "Responsabilidade Pessoal\r\n"
						+ "Trabalho em Equipe\r\n"
						+ "Comunicação\r\n"
						+ "Orientação aos Detalhes\r\n"
						+ "Proatividade";
		}
		
@RestController	
 
		@RequestMapping("/objetivos-semana")
			public class ObjetivosSemanaController {
			@GetMapping
			public String objetivosSemana() {
				return "Manter a persistência e o comprometimento\r\n" 
					 + "E evoluir minhas habilidades técnicas com o que está sendo ensinado\r\n"
					 + "Elaborar e apresentar um ótimo PITCH";
		}
		
		}
	}
		
}
