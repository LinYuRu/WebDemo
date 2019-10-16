package web.app.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.app.demo.dao.ProductDao;
import web.app.demo.model.DeliveryBean;
import web.app.demo.model.ProductBean;
import web.app.demo.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductDao dao;

	@Transactional
	@Override
	public List<ProductBean> getAllProducts() {
		return dao.getAllProducts();
	}

	@Transactional
	@Override
	public List<String> getAllCategories() {
		return dao.getAllCategories();
	}

	@Transactional
	@Override
	public List<ProductBean> getProductsByCategory(String categoryDefualt) {
		return dao.getProductsByCategory(categoryDefualt);
	}

	@Transactional
	@Override
	public ProductBean getProductById(int productId) {
		return dao.getProductById(productId);
	}

	@Transactional
	@Override
	public void addProduct(ProductBean product) {
		dao.addProduct(product);
	}

	@Transactional
	@Override
	public DeliveryBean getpackageById(int packageId) {
		return dao.getpackageById(packageId);
	}

	@Transactional
	@Override
	public List<DeliveryBean> getDeliveryList() {
		return dao.getDeliveryList();
	}

	@Transactional
	@Override
	public List<String> getPackageAddress() {
		return dao.getPackageAddress();
	}

	
	@Transactional
	@Override		// 刪除單項商品規格
	public boolean deleteProduct(Integer productId) {
		ProductBean bean = dao.getProductById(productId);
		if(bean!=null) {
			dao.deleteProduct(bean);
		}
		
		return true;
	}
	
	// 刪除所有商品規格
	@Transactional
	@Override
	public boolean deleteAllProduct(List<ProductBean> beans) {
		for (ProductBean bean : beans) {

			dao.deleteProduct(bean);

		}
		return true;
	}






}
