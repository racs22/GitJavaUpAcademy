package io.altar.stockMaven.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = Shelf.GET_EMPTY_SHELVES, query = "SELECT s FROM Shelf s WHERE s.productId = null"),
		@NamedQuery(name = Shelf.GET_SHELVES_COUNT, query = "SELECT COUNT (s.id) FROM Shelf s"),
		@NamedQuery(name = Shelf.GET_ALL_SHELVES, query = "SELECT s FROM Shelf s"),
		@NamedQuery(name = Shelf.GET_SHELVES_ID, query = "SELECT s.id FROM Shelf s"),
		@NamedQuery(name = Shelf.GET_SHELF_BY_PROD_ID, query = "SELECT s FROM Shelf s WHERE s.productId.id= :prodId "),
		@NamedQuery(name = Shelf.DELETE_SHELF_BY_PROD_ID, query = " SELECT s FROM Shelf s WHERE s.productId.id= :prodId"),
		@NamedQuery(name = Shelf.DELETE_SHELF_BY_PRICE, query = " DELETE FROM Shelf s WHERE s.dailyPrice= :dailyPrice")
})

public class Shelf extends Entity_ {

	private static final long serialVersionUID = 1L;

	public static final String GET_EMPTY_SHELVES = "getEmptyShelves";

	public static final String GET_SHELVES_COUNT = "getShelvesCount";

	public static final String GET_ALL_SHELVES = "getAllShelves";

	public static final String GET_SHELVES_ID = "getShelvesId";

	public static final String GET_SHELF_BY_PROD_ID = "getShelfByProdId";

	public static final String DELETE_SHELF_BY_PROD_ID = "deleteShelfByProdId";
	
	public static final String DELETE_SHELF_BY_PRICE = "deleteShelfByPrice";
	

	private int capacity;
	@ManyToOne
	private Product productId;
	private float dailyPrice;

	public Shelf() {

	}

	public Shelf(int id, int capacity, Product productId, float dailyPrice) {

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

	public Product getProductId() {
		return productId;
	}

	public void setProductId(Product productId) {
		this.productId = productId;
	}

	public float getDailyPrice() {
		return dailyPrice;
	}

	public void setDailyPrice(float dailyPrice) {
		this.dailyPrice = dailyPrice;
	}

}
