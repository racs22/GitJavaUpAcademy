package io.altar.jseproject.textinterface.States;

import io.altar.jseproject.model.Shelf;

public class MenuNewShelf extends State {

	@Override
	public int show() {
		System.out.println("Nova Prateleira");
//		System.out.println("Número da prateleira");
//		int id = sc.getInRange(1, 100); // limitei para 100 prateleiras no máximo
//		System.out.println(id);  // perguntar ao joão como fazemos o set ID e o get ID aqui da entity		
		System.out.println("Defina a Capacidade");
		int cap = sc.getInRange(1, 10);
		System.out.println(cap);
//		System.out.println("ID do produto:");
//		long idProd = sc.getInt();
//		System.out.println(idProd);
		System.out.println("Preço de Aluguer diário:");
		float price = sc.getInRange(1, 30); // limite do preço será 30euros
		System.out.println(price);
		Shelf s = new Shelf(cap, price);
		sr.createID(s);

		return 1;

	}

}