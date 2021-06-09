package io.altar.stockMaven.repositories;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import io.altar.stockMaven.models.Product;

@ApplicationScoped
public class ProductRepository extends EntityRepository<Product> {

	@Override
	protected Class<Product> getEntityClass() {
		// TODO Auto-generated method stub
		return Product.class;
	}

	@Override
	protected String getAllEntities() {
		// TODO Auto-generated method stub
		return Product.GET_ALL_PRODUCT;
	}

	@Override
	protected String getAllEntitiesIds() {
		// TODO Auto-generated method stub
		return Product.GET_PRODUCT_ID;
	}
	
	public long getProductCount(){
		return em.createNamedQuery(Product.GET_PRODUCT_COUNT, Long.class).getSingleResult();
	}
	
	public List<Product> getAllProducts(){
		return em.createNamedQuery(Product.GET_ALL_PRODUCT, getEntityClass()).getResultList();
	}
	
	public List <Product> getProductByDiscount(double discount){
		return em.createNamedQuery(Product.GET_PRODUCT_BY_DISCOUNT, getEntityClass()).setParameter("discount", discount).getResultList();
	}
	
	public List<Product> getProductByPvp(double pvp){
		return em.createNamedQuery(Product.GET_PRODUCT_BY_PVP, getEntityClass()).setParameter("pvp", pvp).getResultList();
	}
	public int deleteProdByDisc(double discount){
		return em.createNamedQuery(Product.DELETE_PROD_BY_DISC).setParameter("discount", discount).executeUpdate();
	}
	public int deleteProdByPvp(double pvp){
		System.out.println(pvp);
		return em.createNamedQuery(Product.DELETE_PROD_BY_PVP).setParameter("pvp", pvp).executeUpdate();
		
	}
	@SuppressWarnings("unchecked")
	public List<Product> getProdOrderByKey (String key) throws Exception {
		if (key.equals("discount") || key.equals("iva") ||key.equals("pvp")) {
			String query = "SELECT p FROM Product p ORDER BY p." + key + " "+ "ASC";  
			return em.createQuery(query).getResultList();
		} else {
			throw new IllegalArgumentException("Please insert a valid key (discount, iva or pvp)");
		}
	}
	
}
