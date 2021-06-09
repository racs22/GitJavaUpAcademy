package io.altar.jseproject.test;

import java.util.Iterator;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.repositories.ProductRepository;
import io.altar.jseproject.textinterface.TextInterface;

public class App {
	public static void main(String[] args) {
		Product p = new Product();
		System.out.println(p);
		TextInterface ti = new TextInterface();
		ti.screenOne();

	}
}