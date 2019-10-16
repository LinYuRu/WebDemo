package web.app.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.app.demo.dao.AdminDao;
import web.app.demo.model.AdminBean;
import web.app.demo.model.AdminProductBean;
import web.app.demo.model.OrderBean;
import web.app.demo.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminDao dao;
	
	@Transactional
	@Override
	public void managerRegister(AdminBean admin) {
		dao.managerRegister(admin);

	}

	@Transactional
	@Override
	public void newAdProduct(AdminProductBean adProduct) {
		dao.newAdProduct(adProduct);
		
	}

	@Transactional
	@Override
	public List<OrderBean> getAllOrders() {
		return dao.getAllOrders();
	}

	@Transactional
	@Override
	public List<AdminBean> getAllManagers() {
		return dao.getAllManagers();
	}

	@Transactional
	@Override
	public AdminBean managerLogin(AdminBean login) {
		Boolean loginStatus;
		List<String> list = new ArrayList<>();
		list = dao.managerLogin(login);
		if ( list.size() > 0 && list.get(0).equals(login.getAdMemberPassword()) ) {
			loginStatus=true;
			login.setLoginStatus(loginStatus);
			
		}else {
			loginStatus=false;
			login.setLoginStatus(loginStatus);		
		}
		return login;
	}

}
