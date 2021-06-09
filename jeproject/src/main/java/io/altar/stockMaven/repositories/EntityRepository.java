package io.altar.stockMaven.repositories;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import io.altar.stockMaven.models.Entity_;

//tem que ser genérico

public abstract class EntityRepository<T extends Entity_> {

	protected abstract Class<T> getEntityClass();

	@PersistenceContext(unitName = "database")
	protected EntityManager em;

	public T createID(T entity) {

		return em.merge(entity);
	}

	public T getEntity(long id) {
		return em.find(getEntityClass(), id);
	}

	public T editEntity(T id) {
		return em.merge(id);
	}

	public void removeID(long id) {
		T entity = getEntity(id);
		if (entity != null) {
			em.remove(entity);
		}

	}

	protected abstract String getAllEntities();

	public List<T> getAll() {
		return em.createNamedQuery(getAllEntities(), getEntityClass()).getResultList();
	}
	
	
	
	protected abstract String getAllEntitiesIds();
	public List<Long> getAllIds(){
		return em.createNamedQuery(getAllEntities(), Long.class).getResultList();
		
	}
}
