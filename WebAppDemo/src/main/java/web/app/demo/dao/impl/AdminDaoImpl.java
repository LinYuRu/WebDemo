package web.app.demo.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import web.app.demo.dao.AdminDao;
import web.app.demo.model.AdminBean;
import web.app.demo.model.AdminProductBean;
import web.app.demo.model.OrderBean;
import web.app.demo.model.ProductBean;
@Repository
public class AdminDaoImpl implements AdminDao {
	@Autowired
	SessionFactory factory;
	
	@Override
	public void managerRegister(AdminBean admin) {
		Session session = factory.getCurrentSession();
		admin.setAdMemberRegisterDate(new java.sql.Timestamp(System.currentTimeMillis()));
		session.save(admin);

	}

	@Override
	public void newAdProduct(AdminProductBean adProduct) {
		Session session = factory.getCurrentSession();
		adProduct.setAdProductAddTime(new java.sql.Timestamp(System.currentTimeMillis()));
		session.save(adProduct);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<OrderBean> getAllOrders() {
		String hql = "FROM OrderBean";
		Session session = null;
		List<OrderBean> list = new ArrayList<>();
		session = factory.getCurrentSession();
		list = session.createQuery(hql).getResultList();
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AdminBean> getAllManagers() {
		String hql = "FROM AdminBean";
		Session session = null;
		List<AdminBean> list = new ArrayList<>();
		session = factory.getCurrentSession();
		list = session.createQuery(hql).getResultList();
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> managerLogin(AdminBean login) {
		List<String> list = new ArrayList<>();
		String hql = "SELECT a.adMemberPassword FROM AdminBean a WHERE a.adMemberEmail = :adMemberAccount";
		Session session = factory.getCurrentSession();
		list = session.createQuery(hql).setParameter("adMemberAccount", login.getAdMemberAccount()).getResultList();
		return list;
	}

}
