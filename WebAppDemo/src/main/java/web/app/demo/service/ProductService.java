package web.app.demo.service;

import java.util.List;

import web.app.demo.model.DeliveryBean;
import web.app.demo.model.ProductBean;

public interface ProductService {
	List<ProductBean> getAllProducts();
	
	List<String> getAllCategories();//Categories查詢

//	List<String> getPackagePrice();
	List<String> getPackageAddress();
	List<ProductBean> getProductsByCategory(String categoryDefualt);
	public ProductBean getProductById(int productId);//查詢單筆產品資料
	//新增產品
	void addProduct(ProductBean product);
	// 刪除單項商品
	public boolean deleteProduct(Integer productId) ;
	// 刪除所有商品規格
	public boolean deleteAllProduct(List<ProductBean> beans);
	//取得包裹資料
	DeliveryBean getpackageById(int packageId);
	//取得運送方式(ex. 7-11，全家)
	List<DeliveryBean> getDeliveryList();
	
//	void deleteProduct(Integer productId);
	
//	void updateStock(Integer productId, Integer productQuantity); //更新產品數量
}
