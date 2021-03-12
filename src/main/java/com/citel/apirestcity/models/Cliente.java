package com.citel.apirestcity.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.sun.istack.NotNull;

@Entity 							
@Table(name="cliente")	
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_cliente;
	
	@NotNull
	private String nome;
	
	@NotNull
	private String sobrenome;
	
	@NotNull
	private String endereco;
	
	@OneToMany
	private List<Cidade> cidade;
	
	@OneToMany
	private List<Telefone> telefone;
	
	//@Column
    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime dat_nasc;
	
	@NotNull
	private BigDecimal limitcredit;

	public long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<Cidade> getCidade() {
		return cidade;
	}

	public void setCidade(List<Cidade> cidade) {
		this.cidade = cidade;
	}

	public List<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}

	public LocalDateTime getDat_nasc() {
		return dat_nasc;
	}

	public void setDat_nasc(LocalDateTime dat_nasc) {
		this.dat_nasc = dat_nasc;
	}

	public BigDecimal getLimitcredit() {
		return limitcredit;
	}

	public void setLimitcredit(BigDecimal limitcredit) {
		this.limitcredit = limitcredit;
	}

	

	

}
