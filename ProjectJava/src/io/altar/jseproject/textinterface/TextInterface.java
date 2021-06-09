package io.altar.jseproject.textinterface;

public class TextInterface {

	ScannerUtils scan = new ScannerUtils();

	public void screenOne() {

		while (true) {

			System.out.println("Selecionar opção");
			System.out.println("1.Listar produtos");
			System.out.println("2.Listar prateleiras");
			System.out.println("3.Sair");

			int userInput = scan.getInRange(1, 3);
			if (userInput == 1) {
				screenTwo();
			}
			if (userInput == 2) {
				screenThree();
			}

			if (userInput == 3) {
				return;
			} 
		}

	}

	public void screenTwo() {

		while (true) {
			System.out.println("Selecionar Opção");
			System.out.println("1.Criar novo produto");
			System.out.println("2.Editar um produto existente");
			System.out.println("3.Consultar o detalhe de um produto");
			System.out.println("4.Remover produto");
			System.out.println("5.Voltar ao ecrã anterior");

			int userInput = scan.getInRange(1, 5);
			if (userInput == 1) {
				//ver o video da aula de hoje
			}
			if (userInput == 2) {
				// Definir mais tarde
			}

			if (userInput == 3) {
				// Definir mmais tarde
			}
			if (userInput == 4) {
				// Definir mmais tarde
			}
			if (userInput == 5) {
				return;
			}

		}

	}

	
	public void screenThree() {

		while (true) {

			System.out.println("Selecionar opção");
			System.out.println("1.Criar novo produto");
			System.out.println("2.Editar um produto existente");
			System.out.println("3.Consultar detalhe de um produto");
			System.out.println("4.Remover produto");
			System.out.println("5.Voltar ao ecrã anterior");

			int userInput = scan.getInRange(1, 5);
			if (userInput == 1) {
				// Definir mais tarde
			}
			if (userInput == 2) {
				// Definir mais tarde
			}

			if (userInput == 3) {
				// Definir mmais tarde
			}
			if (userInput == 4) {
				// Definir mmais tarde
			}
			if (userInput == 5) {
				return;
			}
		}

	}
}
