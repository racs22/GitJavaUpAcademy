package io.altar.stockMaven.services;

import java.util.List;

import javax.enterprise.context.RequestScoped;

import io.altar.stockMaven.models.Shelf;
import io.altar.stockMaven.repositories.ShelfRepository;

@RequestScoped
public class ShelfService extends EntityService <ShelfRepository, Shelf>{

	public List<Shelf> getEmptyShelves(){
		return repository.getEmptyShelves();
	}
	
	public long getShelvesCount(){
		return repository.getShelvesCount();
	}
	
	public List<Shelf> getAllShelves(){
		return repository.getAllShelves();
		
	}
	public List<Shelf> getShelfbyProdId(long prod_id){
		return repository.getShelfByProduct(prod_id);
	}
	
	public List<Shelf> removeShelfByProdId(long prod_id){
		return repository.deleteShelfByProduct(prod_id);
	}
	public int deleteShelfByPrice(float price){
		return repository.deleteShelfByPrice(price);
	}
	public List<Shelf> getShelfByKey(String key) throws Exception {
		return repository.getShelfOrderByKey(key);
	}
}
