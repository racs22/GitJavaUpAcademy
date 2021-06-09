package io.altar.stockMaven.models;

import java.util.ArrayList;

import javax.persistence.Entity;

@Entity
public class Shelf extends Entity_ {

	private static final long serialVersionUID = 1L;

	private int capacity;
	private ArrayList<Long> productId;
	private float dailyPrice;
	
	public Shelf() {
		
	
	}

	public Shelf(int id, int capacity, ArrayList<Long> productId, float dailyPrice) {

		this.capacity = capacity;
		this.productId = productId;
		this.dailyPrice = dailyPrice;
	}

	public Shelf(int capacity, float dailyPrice) {
		this.capacity = capacity;
		this.dailyPrice = dailyPrice;
	}

	@Override
	public String toString() {
		return "Shelf [Shelf ID: " + getId() + ", capacity=" + capacity + ", productId=" + productId + ", dailyPrice="
				+ dailyPrice + "]";
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public ArrayList<Long> getProductId() {
		return productId;
	}

	public void setProductId(ArrayList<Long> productId) {
		this.productId = productId;
	}

	public float getDailyPrice() {
		return dailyPrice;
	}

	public void setDailyPrice(float dailyPrice) {
		this.dailyPrice = dailyPrice;
	}

}
