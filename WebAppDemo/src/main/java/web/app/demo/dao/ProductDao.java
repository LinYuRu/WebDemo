package web.app.demo.dao;

import java.util.List;

import web.app.demo.model.DeliveryBean;
import web.app.demo.model.ProductBean;
import web.app.demo.model.ShopFinanceBean;

public interface ProductDao {

	List<ProductBean> getAllProducts();
	List<String> getAllCategories();
	List<ProductBean> getProductsByCategory(String categoryDefualt);
	public ProductBean getProductById(int productId);//查詢單筆產品資料
	

	List<String> getPackageAddress();
	//新增產品
	void addProduct(ProductBean product);
	//更新產品，不帶圖片
	public int updateProduct(ProductBean product);
	//刪除產品
//	public int deleteProduct(ProductBean product);
	DeliveryBean getpackageById(int packageId);
	public ShopFinanceBean getShopById(Integer shopId);
	List<DeliveryBean> getDeliveryList();
	
	public boolean deleteProduct(ProductBean product);
//	List<String> getPackagePrice();	
//	void updateStock(Integer productId, Integer productQuantity); //更新產品數量
}
