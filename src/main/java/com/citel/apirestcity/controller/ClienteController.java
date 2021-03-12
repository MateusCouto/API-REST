package com.citel.apirestcity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citel.apirestcity.models.Cliente;
import com.citel.apirestcity.repository.ClienteRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API Rest com cadastro de cidades e clientes")			
@CrossOrigin(origins = "*")	
public class ClienteController {
	
	@Autowired ClienteRepository clienteRepository;
	
	@PostMapping("/cliente")
	@ApiOperation(value = "POST Para incluir um novo cliente")
	public Cliente adicionarCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);	
	}
	
	@GetMapping("/cliente")
	@ApiOperation(value = "GET Para retornar todos os clientes do banco de dados")
	public List<Cliente> listaClientes(){
		return clienteRepository.findAll();	
	}

	@GetMapping("/cliente/{id}")
	@ApiOperation(value = "GET Para retornar o cliente com ID informado")
	public Cliente listaClienteUnico(@PathVariable(value = "id") long id_cliente) {
		return clienteRepository.findById(id_cliente);
	}
	
	@PutMapping(value = "/cliente/{id}")
	@ApiOperation(value = "PUT Para alterar o cliente com ID informado")
	public Cliente update(@PathVariable("id") long id_cliente, @RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@DeleteMapping("/cliente/{id}")
	@ApiOperation(value = "DELETE Para excluir o cliente com ID")
	public String deletaCliente(@PathVariable(value = "id",required = true) long id_cliente){
		
		if (clienteRepository.existsById(id_cliente)) {
				clienteRepository.deleteById(id_cliente);
			return "Seu Cliente foi Deletado com Sucesso ID:" + id_cliente;
		}
		else
		{
			return "Seu Cliente não encontrado!";
		}
	}
}
