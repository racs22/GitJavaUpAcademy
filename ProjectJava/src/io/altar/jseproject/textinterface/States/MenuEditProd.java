package io.altar.jseproject.textinterface.States;

import io.altar.jseproject.model.Product;

public class MenuEditProd extends State {

	@Override
	public int show() {
		System.out.println("Editar produtos: (Selecione o ID do produto)"); // Criar uma lista de produtos existentes para editar para serem selecionados
//		sc.getInt();
		long selectedID = sc.getInt();
		Product selectedProd = pr.getEntity(selectedID);
		System.out.println(selectedProd);
		System.out.println("Novo valor de iva:");
		double iva = sc.getInRange(1, 23);
		selectedProd.setIva(iva);
		System.out.println("Novo valor pvp:");
		double pvp = sc.getInRange(1, 50);
		selectedProd.setPvp(pvp);
		System.out.println("Novo valor desconto:");
		double desc = sc.getInRange(1, 100);
		selectedProd.setDiscount(desc);
		pr.editID(selectedProd);
		return 1;
	}

}
