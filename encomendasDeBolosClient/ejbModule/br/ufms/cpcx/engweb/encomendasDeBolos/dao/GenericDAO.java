package br.ufms.cpcx.engweb.encomendasDeBolos.dao;

import java.util.List;

public interface GenericDAO<T>{
	public T persist(T t);
	public void delete(Long id);
	public void delete(T t);
	public List<T> listAll();
	public T findById(Long id);

}
