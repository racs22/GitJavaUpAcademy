package io.altar.jseproject.textinterface.States;

import io.altar.jseproject.model.Product;

public class MenuNewProduct extends State {

	@Override
	public int show() {
		System.out.println("Novo Produto");
		System.out.println("Introduza o Iva do produto");
		double iva = sc.getInRange(1, 23);
		System.out.println(iva);
		System.out.println("Introduza o pvp do produto");
		double pvp = sc.getInRange(1, 150);
		System.out.println("Introduza o desconto do produto");
		double desc = sc.getInRange(1, 100);
		Product p = new Product(desc, iva, pvp);
		pr.createID(p);
		return 1;
	}

}
