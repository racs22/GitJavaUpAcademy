package io.altar.jseproject.model;

import java.util.ArrayList;
import java.util.List; 	

public class Product extends _Entity {
	// objectos a serem instanciados

	private List<Long> shelfIn = new ArrayList<Long>();
	private double discount;
	private double iva;
	private double pvp;
		
	public Product() {
		
	}
	
	//construtores
	public Product( List<Long> shelfIn, double discount, double iva, double pvp) {
		this.shelfIn = shelfIn;
		this.discount = discount;
		this.iva = iva;
		this.pvp = pvp;
	}
	
	public Product( double discount, double iva, double pvp) {
		this.discount = discount;
		this.iva = iva;
		this.pvp = pvp;
	}
	
	// getters e setters 
	

	@Override // servem para voltar a correr a app
	public String toString() {
		return "Product ["+getId()+", shelfIn=" + shelfIn + ", discount=" + discount + ", iva=" + iva + ", pvp=" + pvp + "]";
	}

	public List<Long> getShelfIn() {
		return shelfIn;
	}

	public void setShelfIn(List<Long> shelfIn) {
		this.shelfIn = shelfIn;
	}

	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	public double getPvp() {
		return pvp;
	}
	public void setPvp(double pvp) {
		this.pvp = pvp;
	}
	

}
