package io.altar.stockMaven.models;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ 
		@NamedQuery(name = Product.GET_PRODUCT_COUNT, query = "SELECT COUNT (p.id) FROM Product p"),
		@NamedQuery(name = Product.GET_ALL_PRODUCT, query = "SELECT p FROM Product p"),
		@NamedQuery(name = Product.GET_PRODUCT_ID, query = "SELECT p.id FROM Product p"),
		@NamedQuery(name = Product.GET_PRODUCT_BY_DISCOUNT, query = "SELECT p FROM Product p WHERE p.discount= :discount"),
		@NamedQuery(name = Product.GET_PRODUCT_BY_PVP, query = "SELECT p FROM Product p WHERE p.pvp= :pvp"),
		@NamedQuery(name = Product.DELETE_PROD_BY_DISC, query = "DELETE FROM Product p WHERE p.discount= :discount"),
		@NamedQuery(name = Product.DELETE_PROD_BY_PVP, query = "DELETE  FROM Product p WHERE p.pvp= :pvp")
//		@NamedQuery(name = Product.ORDER_PROD_BY_KEY), query = "SELECT p FROM Product p ORDER BY p." + key + "ASC")
})

public class Product extends Entity_ {
	public static final String GET_PRODUCT_COUNT = "getProductCount";
	public static final String GET_ALL_PRODUCT = "getAllProduct";
	public static final String GET_PRODUCT_ID = "getProductId";
	public static final String GET_PRODUCT_BY_DISCOUNT = "getProdByDiscount";
	public static final String GET_PRODUCT_BY_PVP = "getProductByPvp";
	public static final String DELETE_PROD_BY_DISC = "deleteProdByDisc";
	public static final String DELETE_PROD_BY_PVP = "deleteProdByPvp";
//	public static final String ORDER_PROD_BY_KEY = "deleteProdByKey";

	private static final long serialVersionUID = 1L;

	private double discount;
	private double iva;
	private double pvp;

	public Product() { // O JPA vai sempre pedir um construtor vazio para poder criar uma tabela no
						// mySQL automaticamente!

	}

	public Product(double discount, double iva, double pvp) {
		this.discount = discount;
		this.iva = iva;
		this.pvp = pvp;
	}

	public String toString() {
		return "Product [Product ID: " + getId() + ", shelfIn=" + ", discount=" + discount + ", iva=" + iva + ", pvp="
				+ pvp + "]";
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