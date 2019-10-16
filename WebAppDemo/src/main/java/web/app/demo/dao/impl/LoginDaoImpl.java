package web.app.demo.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import web.app.demo.dao.LoginDao;
import web.app.demo.model.LoginBean;

@Repository
public class LoginDaoImpl implements LoginDao{
	
	@Autowired
	SessionFactory factory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<String> login(LoginBean login) {
		List<String> list = new ArrayList<>();
		
		String hql = "SELECT p.memberPassword FROM LoginBean p WHERE p.memberEmail = :memberAccount";
		Session session = factory.getCurrentSession();

		list = session.createQuery(hql).setParameter("memberAccount", login.getMemberAccount()).getResultList();
		
		return list;
	}
}
