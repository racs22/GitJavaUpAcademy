package io.altar.jseproject.textinterface.States;

import io.altar.jseproject.model.Shelf;

public class MenuRemoveShelf extends State {

	@Override
	public int show() {
		System.out.println("ID da shelf a remover:");
		
		long selectedID = sc.getInt();
		Shelf removeShelf = sr.removeID(selectedID);
		
		System.out.println(removeShelf);
		
		return 1;
	}

}
