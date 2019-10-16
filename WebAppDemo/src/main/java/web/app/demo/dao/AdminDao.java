package web.app.demo.dao;

import java.util.List;

import web.app.demo.model.AdminBean;
import web.app.demo.model.AdminProductBean;
import web.app.demo.model.LoginBean;
import web.app.demo.model.OrderBean;

public interface AdminDao {
	//新增管理員
	void managerRegister(AdminBean admin);
	//自家商品新增
	void newAdProduct(AdminProductBean adProduct);
	//展示所有訂單
	List<OrderBean> getAllOrders();
	//展示所有管理員
	List<AdminBean> getAllManagers();
	//登入
	List<String> managerLogin(AdminBean login);
	
}
