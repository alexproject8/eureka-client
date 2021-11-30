package com.example.eurekaclient.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pruebaController {
	
	@GetMapping(path="/prueba")
	public String prueba() {
		return "Hola mundo";
	}
}
