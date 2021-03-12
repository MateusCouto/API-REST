package com.citel.apirestcity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.citel.apirestcity.models.Cidade;
import com.citel.apirestcity.repository.CidadeRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API Rest com cadastro de cidades e clientes")			
@CrossOrigin(origins = "*")	
public class CidadeController {
	
	@Autowired CidadeRepository cidadeRepository;
	
	@PostMapping("/cidade")
	@ApiOperation(value = "POST Para incluir uma cidade")
	public Cidade cadastrarCidade(@RequestBody Cidade cidade) {
		return cidadeRepository.save(cidade);	
	}
	@GetMapping("/cidades")
	@ApiOperation(value = "GET Para retornar todas as cidades do banco de dados")
	public List<Cidade> buscarCidades(){
		return cidadeRepository.findAll();	
	}
	
	
	@GetMapping("/cidade")
	@ResponseBody
	@ApiOperation(value = "GET Para retornar as cidades pertencentes ao estado informado (SP no exemplo)")
	public List<Cidade> buscarEstado(@RequestParam String estado) {
		return cidadeRepository.findByEstado(estado);
	}
	

	
}