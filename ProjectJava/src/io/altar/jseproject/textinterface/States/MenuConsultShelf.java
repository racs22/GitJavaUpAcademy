package io.altar.jseproject.textinterface.States;

import io.altar.jseproject.model.Shelf;

public class MenuConsultShelf extends State {

	@Override
	public int show() {
		System.out.println("ID da prateleira a consultar:");
		
		long selectedID = sc.getInt();
		Shelf selectedShelf = sr.getEntity(selectedID);
		System.out.println(selectedShelf);
		
		
		return 1;
	}

}
