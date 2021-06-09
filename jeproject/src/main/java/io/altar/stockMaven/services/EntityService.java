package io.altar.stockMaven.services;

import javax.inject.Inject;
import javax.transaction.Transactional;

import io.altar.stockMaven.models.Entity_;
import io.altar.stockMaven.repositories.EntityRepository;

@Transactional
public abstract class EntityService <R extends EntityRepository<E>, E extends Entity_>{

	@Inject
	protected R repository;
	
	public E createID(E id) {
		return repository.createID(id);
		
	}

	public void editID(E id) {
		repository.editEntity(id);
	}
	
	public E getEntity(long entity) {
		return repository.getEntity(entity);
	}
	
	public void removeID(long id) {
		repository.removeID(id);
	}
	
}