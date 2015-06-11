package br.ufms.cpcx.engweb.encomendasDeBolos.datamodel;

import java.io.Serializable;

public class Cliente implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 4029111809917987324L;

	private Long id;

	private String nome;

	private String cpf;

	private Endereco endereco;

	public Cliente() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
