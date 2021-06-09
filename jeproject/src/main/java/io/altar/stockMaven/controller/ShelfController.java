package io.altar.stockMaven.controller;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.altar.stockMaven.models.Shelf;
import io.altar.stockMaven.repositories.ShelfRepository;
import io.altar.stockMaven.services.ShelfService;

@Path("shelf")
@RequestScoped
public class ShelfController extends  EntityController<ShelfService, ShelfRepository, Shelf> {

	
	@GET
	@Path("emptyShelves")
	@Produces(MediaType.APPLICATION_JSON)
	public  String getEmtyShelves() {
		return service.getEmptyShelves().toString();
	}
	@GET
	@Path("shelvesCount")
	@Produces(MediaType.APPLICATION_JSON)
	public  long getShelvesCount() {
		return service.getShelvesCount();
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public  String getAllShelves() {
		return service.getAllShelves().toString();
	}
	
	@GET
	@Path("product/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public  String getNumberShelves(@PathParam("id") long prod_id) {
		return service.getShelfbyProdId(prod_id).toString();
	}
	@DELETE
	@Path("deleteByProdId/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteShelfByProdId(@PathParam("id")long id) {
		service.removeShelfByProdId(id);
	}
	@DELETE
	@Path("deleteByPrice/{price}")
	@Produces(MediaType.APPLICATION_JSON)
	public int deleteShelfByPrice(@PathParam("price") float price) {
		return service.deleteShelfByPrice(price);
	}
	@GET
	@Path("getShelfByKey/{key}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getShelfByKey(@PathParam("key") String key) throws Exception {
		try {
			return Response.ok(service.getShelfByKey(key)).build();
	} catch (IllegalArgumentException e) {
		return Response.status(400).entity(e.getMessage()).build();
	}
		
	}
}
