package io.altar.stockMaven.services;

import java.util.List;

import javax.enterprise.context.RequestScoped;

import io.altar.stockMaven.models.Product;
import io.altar.stockMaven.repositories.ProductRepository;

@RequestScoped
public class ProductService extends EntityService <ProductRepository, Product>{
	
	public long getProductCount(){
		return repository.getProductCount();
	}
	
	public List<Product> getAllProducts(){
		return repository.getAllProducts();
	}
	
	public List <Product> getProductByDiscount(double discount){
		return repository.getProductByDiscount(discount);
	}
	
	public List<Product> getProductByPvp(double pvp){
		return repository.getProductByPvp(pvp);
	}
	public int deleteProdByDisc(double discount){
		return repository.deleteProdByDisc(discount);
	}
	public int deleteProdByPvp(double pvp){
		return repository.deleteProdByPvp(pvp);
	}
	public List<Product> getProdByKeyValue( String key) throws Exception {
		return repository.getProdOrderByKey(key);
	}
}
