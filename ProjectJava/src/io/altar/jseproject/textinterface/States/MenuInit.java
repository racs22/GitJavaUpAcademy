package io.altar.jseproject.textinterface.States;

import io.altar.jseproject.textinterface.ScannerUtils;

public class MenuInit extends State {
	ScannerUtils scan = new ScannerUtils();

	public int show() {

		System.out.println("Selecionar opção");
		System.out.println("1.Listar produtos");
		System.out.println("2.Listar prateleiras");
		System.out.println("3.Sair");

		int userInput = scan.getInRange(1, 3);

		return userInput;
	}

}