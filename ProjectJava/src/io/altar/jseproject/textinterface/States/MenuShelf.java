package io.altar.jseproject.textinterface.States;

import java.util.Collection;

import io.altar.jseproject.model.Shelf;

public class MenuShelf extends State {
	
	@Override
	public int show() {
		System.out.println("Selecionar opção");
		System.out.println("Lista de todas as prateleiras:");
		Collection<Shelf> allShelf = sr.getAll();
		 for ( Shelf s: allShelf ) {
			 System.out.println(s);
		 }
		System.out.println("1.Criar nova prateleira");
		System.out.println("2.Editar prateleira existente");
		System.out.println("3.Consultar detalhe de uma prateleira");
		System.out.println("4.Remover prateleira");
		System.out.println("5.Voltar ao ecrã anterior");

		int userInput = sc.getInRange(1, 5);
		return userInput;
	}


}
