package io.altar.jseproject.textinterface;

import io.altar.jseproject.textinterface.States.MenuConsultProd;
import io.altar.jseproject.textinterface.States.MenuConsultShelf;
import io.altar.jseproject.textinterface.States.MenuEditProd;
import io.altar.jseproject.textinterface.States.MenuEditShelf;
import io.altar.jseproject.textinterface.States.MenuInit;
import io.altar.jseproject.textinterface.States.MenuNewProduct;
import io.altar.jseproject.textinterface.States.MenuNewShelf;
import io.altar.jseproject.textinterface.States.MenuProduct;
import io.altar.jseproject.textinterface.States.MenuRemoveProd;
import io.altar.jseproject.textinterface.States.MenuRemoveShelf;
import io.altar.jseproject.textinterface.States.MenuShelf;
import io.altar.jseproject.textinterface.States.State;

public class StateMachine {

	private State[] states = { new MenuInit(), // State 0
			new MenuProduct(), // State 1
			new MenuShelf(), // State 2
			new MenuNewProduct(), // State 3
			new MenuNewShelf(),// State 4
			new MenuEditProd(),// State 5
			new MenuEditShelf(),// State 6
			new MenuConsultProd(),// State 7
			new MenuConsultShelf(),// State 8 
			new MenuRemoveProd(),// State 9 
			new MenuRemoveShelf(),// State 10
			
	};
	// 4. transitions
	private int[][] transition = { { 1, 2 }, // State 0 -> MenuInicial
			{ 3, 5, 7, 9, 0 }, // State 1 -> MenuProduct
			{ 4, 6, 8, 10, 0 }, // State 2 -> MenuShelf
			{ 1 },
			{ 2 },
			{ 1 },
			{ 2 },
			{ 1 },
			{ 2 },
			{ 1 },
			{ 2}
	};
	// 3. current
	private int current = 0;

	// 5. All client requests are simply delegated to the current state object
	public void start() {
		while (true) {
			int option = states[current].show();
			System.out.println(option);
			if (current == 0 && option == 3) {
				return;
			}
			current = transition[current][option - 1];
		}
	}
	
}

