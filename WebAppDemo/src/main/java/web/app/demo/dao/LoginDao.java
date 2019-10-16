package web.app.demo.dao;

import java.util.List;

import web.app.demo.model.LoginBean;

public interface LoginDao {
	 List<String> login(LoginBean login);
}
