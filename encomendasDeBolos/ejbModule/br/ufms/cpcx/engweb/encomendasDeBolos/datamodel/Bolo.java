package br.ufms.cpcx.engweb.encomendasDeBolos.datamodel;
import java.io.Serializable;
import java.math.BigDecimal;

public class Bolo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6510101799145634331L;
	private Long id;
	
	private Bolo sabor;
	
	private String formato;
	
	private BigDecimal valor;
	
	public Bolo(){
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Bolo getSabor() {
		return sabor;
	}

	public void setSabor(Bolo sabor) {
		this.sabor = sabor;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
