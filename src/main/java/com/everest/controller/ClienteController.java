package com.everest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everest.model.Cliente;
@RestController
public class ClienteController {
	@GetMapping("/clientes")
	public List<Cliente>listar(){
	List<Cliente> lista = new ArrayList<Cliente>();
		Cliente c = new Cliente();
		c.setEmail("Jose@gmail.com");
		c.setId(500);
		c.setNome("Jose Loreto");
		c.setTelefone("3432120675");
		lista.add(c);
		 c = new Cliente();
		c.setEmail("marcio@gmail.com");
		c.setId(400);
		c.setNome("marcio loreto");
		c.setTelefone("3432120675");
		lista.add(c);
		
		// java 11 sem instancia de lista no return usa Array.asList(c,c1); tipo do Id no model é Long
		return lista;
	}
}
