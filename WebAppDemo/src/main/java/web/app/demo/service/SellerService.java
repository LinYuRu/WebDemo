package web.app.demo.service;

import java.util.List;

import web.app.demo.model.PersonalMemberBean;
import web.app.demo.model.ProductBean;
import web.app.demo.model.ShopFinanceBean;

public interface SellerService {
	void addSeller(ShopFinanceBean seller);
	public ShopFinanceBean getSellerById(Integer shopId);
	public ProductBean getProductByshopId(Integer shopId);
	
	public ShopFinanceBean checkIDPassword(String shopAccount, String shopPassword);
	
	public boolean checkIdRepeat(Integer shopId);
	//賣家登入
	ShopFinanceBean sellerlogin(ShopFinanceBean sellerlogin);
}
