package web.app.demo.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import web.app.demo.dao.SellerDao;
import web.app.demo.model.DeliveryBean;
import web.app.demo.model.ProductBean;
import web.app.demo.model.ShopFinanceBean;
@Repository
public class SellerDaoImpl implements SellerDao {
	@Autowired
	SessionFactory factory;
	

	@Override
	public void addSeller(ShopFinanceBean seller) {
		Session session = factory.getCurrentSession();
		seller.setSellerRegDate(new java.sql.Timestamp(System.currentTimeMillis()));
		session.save(seller);
		
	}

	@Override
	public ShopFinanceBean getSellerById(Integer shopId) {
		Session session = factory.getCurrentSession();
		ShopFinanceBean sf = session.get(ShopFinanceBean.class, shopId);
		return sf;
	}

	@Override
	public ShopFinanceBean checkIDPassword(String shopAccount, String shopPassword) {
		ShopFinanceBean sb = null;
		Session session = factory.getCurrentSession();
		String hql = "FROM ShopFinanceBean s WHERE s.shopAccount = :sid and s.shopPassword = :pswd";
		try {
			sb = (ShopFinanceBean) session.createQuery(hql)
							.setParameter("sid", shopAccount)
							.setParameter("pswd", shopPassword)
							.uniqueResult();
		} catch (NoResultException ex) {
			sb = null;
		}
		return sb;
	}

	@Override
	public boolean checkIdRepeat(Integer shopId) {
		Session session = factory.getCurrentSession();
		boolean repeat = false;
		String hql = "FROM ShopFinanceBean s WHERE s.ShopFinanceBean = :shopId";
		try {
			ShopFinanceBean sb = (ShopFinanceBean) session.createQuery(hql)
												.setParameter("shopId", shopId)
												.uniqueResult();
			if (sb != null) {
				repeat = true;
			}
		} catch (NoResultException ex) {
			repeat = false;
		} catch (NonUniqueResultException ex) {
			repeat = true;
		}
		return repeat;
	}

	@Override
	public ProductBean getProductByshopId(Integer shopId) {
		Session session = factory.getCurrentSession();
		ProductBean pb = session.get(ProductBean.class, shopId);
		return pb;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> sellerlogin(ShopFinanceBean sellerlogin) {
		List<String> list = new ArrayList<>();
		String hql = "SELECT p.shopPassword FROM ShopFinanceBean p WHERE p.shopAccount = :shopAccount";
		Session session = factory.getCurrentSession();

		list = session.createQuery(hql).setParameter("shopAccount", sellerlogin.getShopAccount())
				.getResultList();

		return list;
	}

	


}
