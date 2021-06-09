package io.altar.stockMaven.repositories;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import io.altar.stockMaven.models.Shelf;

@ApplicationScoped
public class ShelfRepository extends EntityRepository<Shelf> {

	@Override
	protected Class<Shelf> getEntityClass() {
		// TODO Auto-generated method stub
		return Shelf.class;
	}

	@Override
	protected String getAllEntities() {
		// TODO Auto-generated method stub
		return Shelf.GET_ALL_SHELVES;
	}

	@Override
	protected String getAllEntitiesIds() {
		// TODO Auto-generated method stub
		return Shelf.GET_SHELVES_ID;
	}

	public List<Shelf> getEmptyShelves() {
		return em.createNamedQuery(Shelf.GET_EMPTY_SHELVES, getEntityClass()).getResultList();

	}

	public Long getShelvesCount() {
		return em.createNamedQuery(Shelf.GET_SHELVES_COUNT, Long.class).getSingleResult();
	}

	public List<Shelf> getAllShelves() {
		return em.createNamedQuery(Shelf.GET_ALL_SHELVES, getEntityClass()).getResultList();

	}

	public List<Shelf> getShelfByProduct(long prod_id) {
		return em.createNamedQuery(Shelf.GET_SHELF_BY_PROD_ID, getEntityClass()).setParameter("prodId", prod_id)
				.getResultList();

	}

	public List<Shelf> deleteShelfByProduct(long prod_id) {
		return em.createNamedQuery(Shelf.GET_SHELF_BY_PROD_ID, getEntityClass()).setParameter("prodId", prod_id)
				.getResultList();

	}

	public int deleteShelfByPrice(float price) {
		return em.createNamedQuery(Shelf.DELETE_SHELF_BY_PRICE).setParameter("dailyPrice", price)
				.executeUpdate();
	}
	@SuppressWarnings("unchecked")
	public List<Shelf> getShelfOrderByKey(String key) throws Exception{
		if (key.equals("capacity")||key.equals("productId")||key.equals("dailyPrice")) {
			String query = "SELECT s FROM Shelf s ORDER BY s." + key + " " + "ASC";
			return em.createQuery(query).getResultList();
		} else {
			throw new IllegalArgumentException("Please insert a valid key(capacity, productId, dailyPrice)");
		}
	}
	}
