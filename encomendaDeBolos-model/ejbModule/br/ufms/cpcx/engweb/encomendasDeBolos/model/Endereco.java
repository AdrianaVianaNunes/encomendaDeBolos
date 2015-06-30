package br.ufms.cpcx.engweb.encomendasDeBolos.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Endereco implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1013512924002478272L;
	@Id
	@SequenceGenerator(name = "endereco_seq_gen", sequenceName = "endereco_seq", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "endereco_seq_gen", strategy = GenerationType.SEQUENCE)
	private Long id;
	private String logradouro;
	private Integer numero;
	@OneToOne
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
}
