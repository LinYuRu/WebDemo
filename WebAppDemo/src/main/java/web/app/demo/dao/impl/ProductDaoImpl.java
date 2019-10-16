package web.app.demo.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import web.app.demo.dao.ProductDao;
import web.app.demo.model.DeliveryBean;
import web.app.demo.model.ProductBean;
import web.app.demo.model.ShopFinanceBean;
@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	SessionFactory factory;
	@Autowired
	private SessionFactory sessionFactory = null;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("null")
	public int updateProduct(ProductBean product) {
		int n = 0;
		ProductBean p0 = null;
		Session session = factory.getCurrentSession();
		product.setProductName(p0.getProductName());
//		product.setShopFinance(sb);
		product.setProductupdateTime(new java.sql.Timestamp(System.currentTimeMillis()));
		session.evict(p0);
        session.saveOrUpdate(product);
        n++;	
		return n;
	}

	@Override
	public List<ProductBean> getAllProducts() {
		String hql = "FROM ProductBean";
		Session session = null;
		List<ProductBean> list = new ArrayList<>();
		session = factory.getCurrentSession();
		list = session.createQuery(hql).getResultList();
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> getAllCategories() {
		String hql = "SELECT DISTINCT p.categoryDefualt FROM ProductBean p";
		Session session = factory.getCurrentSession();
		List<String> list = new ArrayList<>();
		list = session.createQuery(hql).getResultList();
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ProductBean> getProductsByCategory(String categoryDefualt) {
		String hql = "FROM ProductBean p WHERE p.categoryDefualt = :categoryDefualt";
		List<ProductBean> list = new ArrayList<>();
		Session session = factory.getCurrentSession();
		list = session.createQuery(hql).setParameter("categoryDefualt", categoryDefualt).getResultList();
		return list;
	}

	@Override
	public ProductBean getProductById(int productId) {
		Session session = factory.getCurrentSession();
		ProductBean pb = session.get(ProductBean.class, productId);
		return pb;
	}

	@Override
	public void addProduct(ProductBean product) {
		Session session = factory.getCurrentSession();
		DeliveryBean pb = getpackageById(product.getPackageId());
//		ShopFinanceBean sb = getShopById(product.getShopId());
		product.setDeliveryBean(pb);
//		product.setShopFinance(sb);
		product.setProductAddTime(new java.sql.Timestamp(System.currentTimeMillis()));
		session.save(product);		
	}
	@Override
	public ShopFinanceBean getShopById(Integer shopId) {
		ShopFinanceBean sb = null;
		Session session = factory.getCurrentSession();
		sb = session.get(ShopFinanceBean.class, shopId);
		return sb;
	}
	@Override
	public DeliveryBean getpackageById(int packageId) {
		DeliveryBean pb = null;
		Session session = factory.getCurrentSession();
		pb = session.get(DeliveryBean.class, packageId);
		return pb;
	}
	

	@Override
	public List<DeliveryBean> getDeliveryList() {
		String hql = "FROM DeliveryBean";
		Session session = factory.getCurrentSession();
		List<DeliveryBean> list = session.createQuery(hql).getResultList();
		return list;
	}

	@Override
	public List<String> getPackageAddress() {
		String hql = "SELECT DISTINCT d.packageAddress FROM DeliveryBean d";
		Session session = factory.getCurrentSession();
		List<String> list = new ArrayList<>();
		list = session.createQuery(hql).getResultList();
		return list;
	}


	@Override
	public boolean deleteProduct(ProductBean product) {
		product = this.getSession().get(ProductBean.class, product.getProductId());
		if (product != null) {
			this.getSession().delete(product);
			return true;
		}
		return false;
	}

//	@Override
//	public void updateStock(Integer productId, Integer productQuantity) {
//		String hql = "UPDATE ProductBean p SET p.productQuantity = :productQuantity WHERE productId = :id";
//		Session session = factory.getCurrentSession();
//		int n = session.createQuery(hql).setParameter("productQuantity", productQuantity)
//										.setParameter("productId", productId)
//										.executeUpdate();
//		
//	}








}
