package web.app.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.app.demo.dao.Top5Dao;
import web.app.demo.model.Top5SellBean;
import web.app.demo.service.Top5Service;
@Service
public class Top5ServiceImpl implements Top5Service {
	@Autowired
	Top5Dao dao;

	@Transactional
	@Override
	public Top5SellBean getTop5ById(int top5Id) {
		return dao.getTop5ById(top5Id);
	}

	@Transactional
	@Override
	public List<Top5SellBean> getAllTop5s() {
		return dao.getAllTop5s();
	}

}
