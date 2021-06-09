package io.altar.jseproject.textinterface.States;

public class MenuRemoveProd extends State {

	@Override
	public int show() {
		
		System.out.println("Produto a remover:");

		long selectedID = sc.getInt();
		
		pr.removeID(selectedID);
		
		return 1;
	}

}
