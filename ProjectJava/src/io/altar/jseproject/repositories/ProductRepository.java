package io.altar.jseproject.repositories;

import io.altar.jseproject.model.Product;

// Esta classe só tem tudo o que herdou do entity repository, passando a classe concreta Product para ele substituir no seu genérico.
// Desta forma passa a ser o Hashmap
public class ProductRepository extends EntityRepositories<Product>{
	
		private static final ProductRepository INSTANCE = new ProductRepository();
		private ProductRepository() {
			
		}
		public static ProductRepository getInstance() {
			return INSTANCE;
		}

		
	}


