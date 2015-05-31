package br.ufms.cpcx.engweb.encomendasDeBolos.datamodel;

import java.io.Serializable;

public class Venda implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4737163466965064491L;

	private Long id;
	
	private Cliente cliente;
	
	private Bolo bolo;
	
	
	public Venda(){
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Bolo getBolo() {
		return bolo;
	}


	public void setBolo(Bolo bolo) {
		this.bolo = bolo;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
