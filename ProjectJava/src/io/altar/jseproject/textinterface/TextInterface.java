package io.altar.jseproject.textinterface;

public class TextInterface {

	ScannerUtils scan = new ScannerUtils();

	public void screenOne() {

		while (true) {

			System.out.println("Selecionar opção");
			System.out.println("Listar produtos");
			System.out.println("Listar prateleiras");
			System.out.println("Sair");

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
			System.out.println("Criar novo produto");
			System.out.println("Editar um produto existente");
			System.out.println("Consultar o detalhe de um produto");
			System.out.println("Remover produto");
			System.out.println("Voltar ao ecrã anterior");

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

	public void screenThree() {

		while (true) {

			System.out.println("Selecionar opção");
			System.out.println("Criar novo produto");
			System.out.println("Editar um produto existente");
			System.out.println("Consultar detalhe de um produto");
			System.out.println("Remover produto");
			System.out.println("Voltar ao ecrã anterior");

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
