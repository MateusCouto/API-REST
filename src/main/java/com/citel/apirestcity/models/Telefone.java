package com.citel.apirestcity.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import com.sun.istack.NotNull;

@Entity 							
@Table(name="telefone")	
public class Telefone implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_telefone;
	
	@NotNull
	private String telefone;
	
	@ManyToOne
	private Cliente cliente;

	public long getId_telefone() {
		return id_telefone;
	}

	public void setId_telefone(long id_telefone) {
		this.id_telefone = id_telefone;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
