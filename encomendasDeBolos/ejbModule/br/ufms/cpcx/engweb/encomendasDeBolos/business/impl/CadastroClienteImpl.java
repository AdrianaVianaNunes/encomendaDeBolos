package br.ufms.cpcx.engweb.encomendasDeBolos.business.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.ufms.cpcx.engweb.encomendasDeBolos.business.CadastroCliente;
import br.ufms.cpcx.engweb.encomendasDeBolos.dao.ClienteDAO;
import br.ufms.cpcx.engweb.encomendasDeBolos.model.Cliente;

@Stateless
public class CadastroClienteImpl implements CadastroCliente {
	@EJB
	private ClienteDAO clienteDAO;

	@Override
	public Cliente cadastrarCliente(Cliente cliente) {
		// Validar CPF
		// Validar rendaMensal
		return clienteDAO.persist(cliente);
	}

	@Override
	public List<Cliente> listarClientes() {
		return clienteDAO.listAll();
	}

	@Override
	public void removerCliente(Cliente cliente) {
		if(verificarVinculoClienteVenda(cliente.getId())){
			// faz o que manda o negocio
		}else{
			clienteDAO.removerCliente(cliente.getId());
		}
		
	}

	@Override
	public void removerCliente(Long id) {
		if(verificarVinculoClienteVenda(id)){
			// faz o que manda o negocio
		}else{
			clienteDAO.removerCliente(id);
		}
	}
	
	private boolean verificarVinculoClienteVenda(Long id){
		// se tiver relacionamento retorna falso
		// senão retorna verdadeiro
		return false; 
	}
}
