package br.ufms.cpcx.engweb.encomendasDeBolos.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.ufms.cpcx.engweb.encomendasDeBolos.dao.ClienteDAO;
import br.ufms.cpcx.engweb.encomendasDeBolos.model.Cliente;


<<<<<<< HEAD








=======
>>>>>>> d5337d6f86900794b882e1ad7d48e3ec15c82d8e
@Stateless
public class ClienteDAOImpl implements ClienteDAO {
	@PersistenceContext
	private EntityManager em;

	@Override
	public Cliente persist(Cliente t) {
		if (t.getId() != null) {
			return em.merge(t);
		}
		em.persist(t);
		return t;
	}

	@Override
	public void delete(Long id) {
		Query query = em
				.createQuery("DELETE FROM Cliente c WHERE c.id = " + id);
		query.executeUpdate();
	}

	@Override
	public void delete(Cliente t) {
		em.remove(t);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> listAll() {
		Query query = em.createQuery("SELECT c FROM Cliente c");
		return (List<Cliente>) query.getResultList();
	}

	@Override
	public Cliente findById(Long id) {
		return em.find(Cliente.class, id);
	}

	@Override
	public Cliente buscarPorCpf(String cpf) {
		return null;
	}

	@Override
	public void removerCliente(Cliente cliente) {
		em.remove(cliente);
	}

	@Override
	public void removerCliente(Long id) {
		//Cliente cliente = findById(id);
	    //removerCliente(cliente);
		Query query = em.createQuery("DELETE FROM Cliente c WHERE c.id = "+id);
		query.executeUpdate();
	}

}
