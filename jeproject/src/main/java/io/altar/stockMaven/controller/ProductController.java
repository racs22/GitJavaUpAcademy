package io.altar.stockMaven.controller;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.altar.stockMaven.models.Product;
import io.altar.stockMaven.repositories.ProductRepository;
import io.altar.stockMaven.services.ProductService;

@Path("products")
@RequestScoped
public class ProductController extends EntityController<ProductService, ProductRepository, Product> {

	@GET
	@Path("prodCount")
	@Produces(MediaType.APPLICATION_JSON)
	public long getProdCount() {
		return service.getProductCount();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getAllProducts() {
		return service.getAllProducts();
	}

	@GET
	@Path("getProdByDisc/{discount}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getProductByDiscount(@PathParam("discount") double discount) {
		return service.getProductByDiscount(discount);
	}

	@GET
	@Path("getProdByPvp/{pvp}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getProductByPvp(@PathParam("pvp") double pvp) {
		return service.getProductByPvp(pvp);
	}

	@DELETE
	@Path("deleteProdByDisc/{discount}")
	@Produces(MediaType.APPLICATION_JSON)
	public int deleteProdByDisc(@PathParam("discount") double discount) {
		return service.deleteProdByDisc(discount);
	}

	@DELETE
	@Path("deleteProdByPvp/{pvp}")
	@Produces(MediaType.APPLICATION_JSON)
	public int deleteProdByPvp(@PathParam("pvp") double pvp) {
		return service.deleteProdByPvp(pvp);
	}

	@GET
	@Path("getProdByKey/{key}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getProdByKey(@PathParam("key") String key) throws Exception {
		try {
			return Response.ok(service.getProdByKeyValue(key)).build();
	} catch (IllegalArgumentException e) {
		return Response.status(400).entity(e.getMessage()).build();
	}
}
}
