package io.altar.stockMaven.models;

import java.util.ArrayList;

import javax.persistence.Entity;

@Entity
public class Product extends Entity_ {

	private static final long serialVersionUID = 1L;

	private ArrayList<Long> shelfIn = new ArrayList<Long>();
	private double discount;
	private double iva;
	private double pvp;

	public Product(ArrayList<Long> shelfIn, double discount, double iva, double pvp) {
		this.shelfIn = shelfIn;
		this.discount = discount;
		this.iva = iva;
		this.pvp = pvp;
	}
	public Product() { //  O JPA vai sempre pedir um construtor vazio para poder criar uma tabela no mySQL automaticamente! 
		
	}
	
	public Product( double discount, double iva, double pvp) {
		this.discount = discount;
		this.iva = iva;
		this.pvp = pvp;
	}

	public String toString() {
		return "Product [Product ID: " + getId() + ", shelfIn=" + shelfIn + ", discount=" + discount + ", iva=" + iva
				+ ", pvp=" + pvp + "]";
	}

	public ArrayList<Long> getShelfIn() {
		return shelfIn;
	}

	public void setShelfIn(ArrayList<Long> shelfIn) {
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