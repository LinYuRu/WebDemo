package web.app.demo.dao;

import java.util.List;


import web.app.demo.model.Top5SellBean;

public interface Top5Dao {
	public Top5SellBean getTop5ById(int top5Id);
	List<Top5SellBean> getAllTop5s();
}
