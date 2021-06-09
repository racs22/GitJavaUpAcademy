package io.altar.jseproject.textinterface.States;

import io.altar.jseproject.repositories.ProductRepository;
import io.altar.jseproject.repositories.ShelfRepository;
import io.altar.jseproject.textinterface.ScannerUtils;

public abstract class State {

	ScannerUtils sc = new ScannerUtils();
	ProductRepository pr = ProductRepository.getInstance();
	ShelfRepository sr = ShelfRepository.getInstance();
	
	public abstract int show();
}
