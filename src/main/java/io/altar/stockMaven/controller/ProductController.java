package io.altar.stockMaven.controller;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

import io.altar.stockMaven.models.Product;
import io.altar.stockMaven.repositories.ProductRepository;
import io.altar.stockMaven.services.ProductService;

@Path("Product")
@RequestScoped
public class ProductController extends EntityController<ProductService,ProductRepository , Product> {

}
