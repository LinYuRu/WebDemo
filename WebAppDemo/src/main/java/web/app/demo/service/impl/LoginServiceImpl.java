package web.app.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.app.demo.dao.LoginDao;
import web.app.demo.model.LoginBean;
import web.app.demo.service.LoginService;
import javax.servlet.http.HttpSession;
@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	LoginDao dao;

	@Transactional
	@Override
	public LoginBean login(LoginBean login) {
		Boolean ret;
		List<String> list = new ArrayList<>();
		list = dao.login(login);
		if ( list.size() > 0 && list.get(0).equals(login.getMemberPassword()) ) {
			ret=true;
			login.setRes(ret);
			
		}else {
			ret=false;
			login.setRes(ret);		
		}
		return login;
	}

}
