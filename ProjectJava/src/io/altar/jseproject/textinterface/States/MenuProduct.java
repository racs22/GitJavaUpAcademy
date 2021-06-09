package io.altar.jseproject.textinterface.States;

import java.util.Collection;

import io.altar.jseproject.model.Product;

public class MenuProduct extends State{
	
	@Override
	public int show() {
		System.out.println("Lista de todos os produtos:");
		Collection<Product> allProd = pr.getAll();
		for( Product p: allProd ) {
			System.out.println(p);
		}
		System.out.println("Selecionar op��o");
		System.out.println("1.Criar novo produto");
		System.out.println("2.Editar um produto existente");
		System.out.println("3.Consultar detalhe de um produto");
		System.out.println("4.Remover produto");
		System.out.println("5.Voltar ao ecr� anterior");

		int userInput = sc.getInRange(1, 5);
		return userInput;
	}

}
