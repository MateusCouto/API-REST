package com.citel.apirestcity.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.citel.apirestcity.models.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{
	
	List<Cidade> findByEstado(String estado);

    
}