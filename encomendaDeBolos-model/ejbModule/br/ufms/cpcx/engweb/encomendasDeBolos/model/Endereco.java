package br.ufms.cpcx.engweb.encomendasDeBolos.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

public class Endereco implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name = "endereco_seq_gen", 
						sequenceName = "endereco_seq", 
							allocationSize = 1, 
								initialValue = 1)
	@GeneratedValue(generator = "endereco_seq_gen", strategy = GenerationType.SEQUENCE)
	private Long id;
	private String logradouro;
	private Integer numero;
	@OneToOne
	private Cliente cliente;

	public Endereco() {
		// TODO Auto-generated constructor stub
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
	
	
}
