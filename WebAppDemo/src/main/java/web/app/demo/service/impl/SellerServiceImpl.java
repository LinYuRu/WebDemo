package web.app.demo.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.app.demo.dao.SellerDao;
import web.app.demo.model.PersonalMemberBean;
import web.app.demo.model.ProductBean;
import web.app.demo.model.ShopFinanceBean;
import web.app.demo.service.SellerService;
@Service
public class SellerServiceImpl implements SellerService {
	@Autowired
	SellerDao dao;

	@Transactional
	@Override
	public void addSeller(ShopFinanceBean seller) {
		dao.addSeller(seller);
		
	}

	@Transactional
	@Override
	public ShopFinanceBean getSellerById(Integer shopId) {
		return dao.getSellerById(shopId);
	}

	@Transactional
	@Override
	public ShopFinanceBean checkIDPassword(String shopAccount, String shopPassword) {
		ShopFinanceBean sb = null;
		sb = dao.checkIDPassword(shopAccount, shopPassword);
		return sb;
	}

	@Transactional
	@Override
	public boolean checkIdRepeat(Integer shopId) {
		boolean repeat = false;
		repeat = dao.checkIdRepeat(shopId);
		return repeat;
	}

	@Transactional
	@Override
	public ProductBean getProductByshopId(Integer shopId) {
		return dao.getProductByshopId(shopId);
	}

	
	@Transactional
	@Override
	public ShopFinanceBean sellerlogin(ShopFinanceBean sellerlogin) {
		Boolean ret;
		List<String> list = new ArrayList<>();
		list = dao.sellerlogin(sellerlogin);
		if (list.size() > 0 && list.get(0).equals(sellerlogin.getShopPassword())) {
			ret = true;
			sellerlogin.setRes(ret);

		} else {
			ret = false;
			sellerlogin.setRes(ret);
		}
		return sellerlogin;

	}

	

}

