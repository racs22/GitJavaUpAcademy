package io.altar.jseproject.textinterface.States;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.model.Shelf;

public class MenuEditShelf extends State {

	@Override
	public int show() {
		System.out.println("Editar prateleira: (Selecione ID da prateleira)"); 
		long selectedID = sc.getInt();
		System.out.println(selectedID);
		Shelf selectedShelf = sr.getEntity(selectedID);
		System.out.println("Definir nova capacidade:");
		int iva = sc.getInRange(1, 10);
		System.out.println(iva);
		System.out.println("Definir novo preço diário:");
		float price = sc.getInt();
		System.out.println(price);
		sr.editID(selectedShelf);
		
		return 1;
	}

}
