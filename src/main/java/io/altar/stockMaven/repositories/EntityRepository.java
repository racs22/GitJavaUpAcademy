package io.altar.stockMaven.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import io.altar.stockMaven.models.Entity_;

//tem que ser genérico
public abstract class EntityRepository <T extends Entity_ >{
	
	
	@PersistenceContext(unitName = "database")
	protected abstract Class<T> getEntityClass();
	protected EntityManager em;
	


	public T createID (T entity) {
		return em.merge(entity);
	}
	
	public T getEntity(long id) {
		return em.find(getEntityClass(), id);
	}
	
	public T editEntity (T id) {
		return em.merge(id);
	}
	public void removeID(long id) {
		T entity=getEntity(id);
		if (entity != null) {
			em.remove(entity);
		}	
	
//	public T getEntity(long id) {
//		return map.get(id);
//	}
//
//	// get nextID
//	private long nextID() {
//		return ++currentId;
//	}
//	public long createID(T entidade) {
//		entidade.setId(nextID()); // O produto qd vem do textinterface n tem ID, esta fun��o vai pedir ao
//									// repositorio qual o Id atrav�s do setId()
//		map.put(entidade.getId(), entidade); // vai guardar no map atrav�s do getId()
//		return entidade.getId();
//
//	}
//
//// editar
//	public void editID(T entidade) {
//		map.put(entidade.getId(), entidade);
//
//	}
//
//// remover
//	public T removeID(long id) {
//		return map.remove(id);
//
//	}
//
//	// consultar
//	public Collection<T> getAll() {
//		return map.values();
//
//	}
	}
}
