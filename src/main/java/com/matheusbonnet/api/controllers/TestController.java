package com.matheusbonnet.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TestController {

	@GetMapping(value = "/oi")
	public String getOi() {
		return "Oi pessoal!";
	}
	
	@GetMapping("/ola")
	public String getOla() {
		return "Ola pessoal!";
	}
}
