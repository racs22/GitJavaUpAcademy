package io.altar.jseproject.test;


import java.util.Iterator;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.repositories.ProductRepository;

public class RepositoryTest {

	public static void main(String[] args) {
		

		ProductRepository pr = ProductRepository.getInstance();
		Product p = new Product();
		pr.createID(p);
		Product p2 = new Product();
		pr.createID(p2);
		
		Iterator<Product> it = pr.getAll().iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
//		pr.removeID(1);
//		it = pr.getAll().iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//			
//		}
		
//		System.out.println("Teste get:" + pr.getEntity(1));
//	}
	
//	ProductRepository pr = ProductRepository.getInstance();
//	Product p= new Product();
//	p.setIva(23);
//	p.setPvp(10);
//	p.setDiscount(0);
//	pr.createID(p);
//	
//	Iterator <Product> it = pr.getAll().iterator();
//	while (it.hasNext()) {
//		System.out.println();
//	}

	}
}
