package io.altar.stockMaven.controller;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;

import io.altar.stockMaven.models.Entity_;
import io.altar.stockMaven.repositories.EntityRepository;
import io.altar.stockMaven.services.EntityService;

public abstract class EntityController <S extends EntityService<R, E>, R extends EntityRepository <E>, E extends Entity_> {
	@Inject
	protected S service;
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public E createID(E id) {
		return service.createID(id);
	}
}

