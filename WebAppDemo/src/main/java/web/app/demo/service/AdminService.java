package web.app.demo.service;

import java.util.List;

import web.app.demo.model.AdminBean;
import web.app.demo.model.AdminProductBean;
import web.app.demo.model.LoginBean;
import web.app.demo.model.OrderBean;

public interface AdminService {
	void managerRegister(AdminBean admin);

	// 自家商品新增
	void newAdProduct(AdminProductBean adProduct);

	// 展示所有訂單
	List<OrderBean> getAllOrders();

	// 展示所有管理員
	List<AdminBean> getAllManagers();
	
	//登入
	AdminBean managerLogin(AdminBean login);
}
