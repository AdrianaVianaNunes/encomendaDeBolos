package br.ufms.cpcx.engweb.encomendasDeBolos.dao;

import br.ufms.cpcx.engweb.encomendasDeBolos.model.Cliente;

public interface ClienteDAO extends GenericDAO<Cliente>{
	public Cliente buscarPorCpf(String cpf);
	public void removerCliente(Cliente cliente);
	public void removerCliente(Long id);

}
