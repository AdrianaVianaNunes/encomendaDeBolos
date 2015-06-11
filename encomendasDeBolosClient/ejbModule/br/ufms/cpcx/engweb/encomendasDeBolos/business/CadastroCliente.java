package br.ufms.cpcx.engweb.encomendasDeBolos.business;

import java.util.List;

import br.ufms.cpcx.engweb.encomendasDeBolos.model.Cliente;

public interface CadastroCliente {
	public Cliente cadastrarCliente(Cliente cliente);
	public List<Cliente> listarClientes();
	public void removerCliente(Cliente cliente);
	public void removerCliente(Long id);

}
