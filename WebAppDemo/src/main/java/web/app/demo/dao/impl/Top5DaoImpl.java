package web.app.demo.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import web.app.demo.dao.Top5Dao;
import web.app.demo.model.ProductBean;
import web.app.demo.model.Top5SellBean;
@Repository
public class Top5DaoImpl implements Top5Dao {
	@Autowired
	SessionFactory factory;

	@Override
	public Top5SellBean getTop5ById(int top5Id) {
		Session session = factory.getCurrentSession();
		Top5SellBean top5 = session.get(Top5SellBean.class, top5Id);
		return top5;
	}

	@Override
	public List<Top5SellBean> getAllTop5s() {
		String hql = "FROM Top5SellBean";
		Session session = null;
		List<Top5SellBean> list = new ArrayList<>();
		session = factory.getCurrentSession();
		list = session.createQuery(hql).getResultList();
		return list;
	}

}
