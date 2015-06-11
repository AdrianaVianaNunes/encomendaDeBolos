package br.ufms.cpcx.engweb.encomendasDeBolos.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="cliente_seq_gen", sequenceName="cliente_seq", initialValue=1, allocationSize=1)
	@GeneratedValue(generator="cliente_seq_gen", strategy=GenerationType.SEQUENCE)
	private Long id;
	@NotBlank(message="Nome é obrigatório")
	private String nome;
	@NotBlank (message="CPF é obrigatório")
	private String cpf;
	@OneToOne(mappedBy="cliente")
	private Endereco endereco;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
