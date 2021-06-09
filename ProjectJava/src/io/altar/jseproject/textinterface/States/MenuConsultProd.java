package io.altar.jseproject.textinterface.States;

import io.altar.jseproject.model.Product;

public class MenuConsultProd extends State {

	@Override
	public int show() {
		
		System.out.println("ID do produto a consultar:");
		
		long selectedID = sc.getInt();
		Product selectedProd = pr.getEntity(selectedID);
		System.out.println(selectedProd);
		
		return 1;
	}

}
