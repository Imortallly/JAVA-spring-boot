package br.com.gomes.app.controllers;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	@GetMapping("/somar/{number1}/{number2}")
	public int somar(@PathVariable int number1,@PathVariable int number2) {
		
		int resultado = number1 + number2;
		
		return resultado;
	}
	
	@GetMapping("/subtrair")
	public int subtrair(
			@RequestParam(name = "a") int number1,
			@RequestParam(name = "b") int number2) {
		
		int resultado = number1 - number2;
		return resultado;
	}
	
}
