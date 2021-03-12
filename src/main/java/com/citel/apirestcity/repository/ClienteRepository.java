package com.citel.apirestcity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.citel.apirestcity.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	Cliente findById(long id_cliente);
	 
}