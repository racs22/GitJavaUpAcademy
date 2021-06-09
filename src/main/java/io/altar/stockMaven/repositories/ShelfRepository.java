package io.altar.stockMaven.repositories;

import javax.enterprise.context.ApplicationScoped;

import io.altar.stockMaven.models.Shelf;

@ApplicationScoped
public class ShelfRepository extends EntityRepository<Shelf> {

	@Override
	protected Class<Shelf> getEntityClass() {
		// TODO Auto-generated method stub
		return Shelf.class;
	}

}
