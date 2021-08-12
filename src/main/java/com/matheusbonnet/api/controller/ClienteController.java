package com.matheusbonnet.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusbonnet.api.domain.model.Cliente;
import com.matheusbonnet.api.domain.repository.ClienteRepository;

@RestController
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepo;
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		return clienteRepo.findAll();
	}

}
