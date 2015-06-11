package br.ufms.cpcx.engweb.encomendasDeBolos.datamodel;

import java.io.Serializable;

public class Endereco implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5882754013777206464L;
	private Long id;
	private String logradouro;
	private Integer numero;
	private Cliente cliente;
	
	public Endereco() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
