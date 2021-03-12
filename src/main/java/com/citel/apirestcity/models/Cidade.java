package com.citel.apirestcity.models;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity 							
@Table(name="cidade")			
public class Cidade implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_cidade;
	
	@NotNull
	private String nome;
	
	@NotNull
	@Column(length = 2)
	private String estado;
	
	@ManyToOne
	private Cliente cliente;

	public long getId_cidade() {
		return id_cidade;
	}

	public void setId_cidade(long id_cidade) {
		this.id_cidade = id_cidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	


}
