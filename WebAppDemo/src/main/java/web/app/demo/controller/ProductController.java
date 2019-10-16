package web.app.demo.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.rowset.serial.SerialBlob;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import web.app.demo.model.DeliveryBean;
import web.app.demo.model.LoginBean;
import web.app.demo.model.ProductBean;
import web.app.demo.model.ShopFinanceBean;
import web.app.demo.service.ProductService;

@Controller
@SessionAttributes(names = { "productId" })
public class ProductController {
	@Autowired
	ProductService service;
	
	@Autowired
	ServletContext context;
	
	@Autowired
	HttpSession session;
	
//	@RequestMapping("/updateProduct")
//	public String updateProduct(Model model) {
//		service.updateStock();
//		return "redirect:/products";
//	}
	
	@RequestMapping(value="/getPicture/{productId}", method=RequestMethod.GET)
	public ResponseEntity<byte[]> getPicture(HttpServletResponse resp, @PathVariable Integer productId){
		//ResponseEntity表示回應-->回應給瀏覽器的本體是位元組陣列組成的(<byte[]>)
		//ResponseEntity蒐集好位元組陣列，狀態列，標頭再傳回給Browser
		//顯示圖片
		String filePath = "/resources/images/NoImage.jpg";
		byte[]media = null;
		HttpHeaders headers = new HttpHeaders();
		String filename = "";
		int len = 0;
		ProductBean bean = service.getProductById(productId);
		if(bean != null) {
			Blob blob = bean.getCoverImage();
			filename = bean.getFileName();
			if(blob != null) {
				try {
					len = (int)blob.length();
					media = blob.getBytes(1, len);
					//陣列由1開頭不是0
				}catch(SQLException e) {
					throw new RuntimeException("ProductController的getPicture()發生錯誤SQLException"+e.getMessage());
				}
			}else {
				media = toByteArray(filePath);
				filename = filePath;
			}
		}else {
			media = toByteArray(filePath);
			filename = filePath;
		}
		//CacheControl.noCache要求瀏覽器不要放到快取區
		headers.setCacheControl(CacheControl.noCache().getHeaderValue());
	    String mimeType = context.getMimeType(filename);
	    MediaType mediaType = MediaType.valueOf(mimeType);
	    System.out.println("mediaType =" + mediaType);
	    headers.setContentType(mediaType);
	    //告知瀏覽器ContentType(型別mediaType)
	    ResponseEntity<byte[]> responseEntity = 
	                new ResponseEntity<>(media, headers, HttpStatus.OK);
	    //<byte[media, headers, HttpStatus.OK]
	    return responseEntity;
		
	}
	
	private byte[]toByteArray(String filepath){
		byte[] b = null;
		String realPath = context.getRealPath(filepath);
		try {
			File file = new File(realPath);
			long size = file.length();
			b = new byte[(int)size];
			InputStream fis = context.getResourceAsStream(filepath);
			fis.read(b);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return b;
	}
	
	
			
	
	 
	@RequestMapping(value = { "/products/{categoryDefualt}", "/productdetails/products/{categoryDefualt}",
			"/listview/products/{categoryDefualt}", "/fourcol/products/{categoryDefualt}",
			"/threecol/products/{categoryDefualt}", "/product/products/{categoryDefualt}",
			"/products/products/{categoryDefualt}", "/top5Product/products/{categoryDefualt}"})
	public String getProductsByCategory(@PathVariable("categoryDefualt") String categoryDefualt, Model model) {
		List<ProductBean> products = service.getProductsByCategory(categoryDefualt);
		model.addAttribute("products", products);
		return "products";
	}

	@RequestMapping(value = { "/index", "/" , "/top5Product/index",
			"/addProduct/index", "/listview/index", "/fourcol/index",
			"/threecol/index", "/product/index", "/products/index"})
	public String getCategoryList(Model model) {
		List<String> list = service.getAllCategories();
		model.addAttribute("categoryDefualt", list);
		return "forward:/redirectIndex";
	}
	
	@RequestMapping(value = { "/products", "/redirectProducts", "/productdetails/products", "/addProduct/products", "/listview/products",
			"/fourcol/products", "/threecol/products", "/product/products", "products/products", "/top5Product/products" })
	public String allProductslist(Model model) {
		List<ProductBean> list = service.getAllProducts();
		model.addAttribute("products", list);
		
		return "products";
	}
	
	@RequestMapping(value = { "/threecol", "/addProduct/threecol", 
			"/listview/threecol", "/fourcol/threecol", "/threecol/threecol",
			 "/product/threecol", "/products/threecol", "/top5Product/threecol"})
	public String threeColView(Model model) {
		List<ProductBean> list = service.getAllProducts();
		model.addAttribute("products", list);
		return "threecol";
	}
	
	@RequestMapping(value = { "/listview", "/productdetails/listview", 
			"/addProduct/listview", "/listview/listview", "/fourcol/listview",
			"/threecol/listview", "/product/listview", "/products/listview" , "/top5Product/listview"})
	public String listView(Model model) {
		List<ProductBean> list = service.getAllProducts();
		model.addAttribute("products", list);
		return "listview";
	}
	
	@RequestMapping(value = { "/fourcol", "/addProduct/fourcol", 
			"/listview/fourcol", "/fourcol/fourcol", "/threecol/fourcol", 
			"/product/fourcol", "/products/fourcol", "/top5Product/fourcol" })
	public String fourColView(Model model) {
		List<ProductBean> list = service.getAllProducts();
		model.addAttribute("products", list);
		return "fourcol";
	}
	
	@RequestMapping(value = {"/product", "/addProduct/fproduct", 
			"/listview/product", "/fourcol/product", "/threecol/product",
			 "/product/product", "/products/product" })
	public String getProductsById(@RequestParam("productId") Integer productId, Model model) {
		model.addAttribute("product", service.getProductById(productId));
		return "product";
	}

	@RequestMapping(value="/addProduct", method = RequestMethod.GET)
	public String getAddNewProductForm(@ModelAttribute("memberEmail") LoginBean login, Model model) {
		ProductBean pb = new ProductBean();
		model.addAttribute("ProductBean", pb);
		return "addProduct";
	}
	
	
	@RequestMapping(value="/addProduct", method = RequestMethod.POST)
	public String processAddNewProductForm(@ModelAttribute("ProductBean") ProductBean pb, 
			BindingResult result, HttpServletRequest request) {
		String[] suppressedFields = result.getSuppressedFields();
		if (suppressedFields.length > 0) {
			throw new RuntimeException("嘗試傳入不允許的欄位: " + 
		    StringUtils.arrayToCommaDelimitedString(suppressedFields));
		}
		if(pb.getProductQuantity()==null) {
			pb.setProductQuantity(0);
		}
		MultipartFile productImage = pb.getProductImage();
		String originalFilename = productImage.getOriginalFilename();
		pb.setFileName(originalFilename);
		
		
		//存入檔名(主檔名)
//  	//ext找出附檔名，位置是子字串的逗點
		String ext = originalFilename.substring(originalFilename.lastIndexOf("."));
		String path = context.getRealPath("/");
		// 取得路徑(有些API要完整路徑)
		// 由Hibernate寫入DB
		if(productImage != null && !productImage.isEmpty()) {
			try {
				byte[] b = productImage.getBytes();
				//先取得位元組陣列物件
				Blob blob = new SerialBlob(b);
				// 由SerialBlob取得Blob物件，要一個位元組物件
				pb.setCoverImage(blob);
			}catch(Exception e) {
				e.printStackTrace();
				throw new RuntimeException("檔案上傳發生異常" + e.getMessage());
			}
		}
		service.addProduct(pb);
		try {				 //File(File parent, file 子檔案)
			File imageFolder = new File(path, "images");
			if(!imageFolder.exists()) imageFolder.mkdirs(); 
			//如果沒有資料夾就新建一個
			File file = new File(imageFolder, pb.getProductId() + ext);		
				productImage.transferTo(file);
//              將原始檔轉移到目標檔案，使用transferTo方法			
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException("檔案上傳發生異常" + e.getMessage());
			}
		return "redirect:/products";
	}
	
	

	@ModelAttribute("deliveryList")
	public Map<Integer, String> getDeliveryList(){
		Map<Integer, String> deliveryMap = new HashMap<>();
		List<DeliveryBean> list = service.getDeliveryList();
		for(DeliveryBean db :list) {
			deliveryMap.put(db.getPackageId(), db.getPackagePrice());
		}
		return deliveryMap;
	}
	
	@ModelAttribute("categoryList") //新增產品表單的選項
	public List<String> getPackagePriceList(){
		return service.getAllCategories();
	}

	
//	@RequestMapping(value="sellerProductList", method = RequestMethod.GET)
//	public String getsellerProductList(Model model, HttpServletRequest request, HttpServletResponse response) {
//		List<ProductBean> list = service.getAllProducts();
//		model.addAttribute("products", list);
//		return "sellerProductList";
//	}
//	
//	@RequestMapping(value="sellerProductList", method = RequestMethod.POST)
//	public String DeleteProduct(Model model, HttpServletRequest request, HttpServletResponse response) {
//		List<ProductBean> list = service.getAllProducts();
//		model.addAttribute("products", list);
//		return "sellerProductList";
//	}
	
	@InitBinder
	public void whiteListing(WebDataBinder binder) {
		binder.setAllowedFields(
				"productName",
				"productInfo",
				"productPrice",
				"productQuantity",
				"classDefualt",
				"productWeight",
				"productStatus",
				"productImage",
				"categoryDefualt",
				"packageId"
				);
	}


	@RequestMapping("/index/Prohibitionandrestrictiofofcommoditypolicies")
	public String Prohibitionandrestrictiofofcommoditypolicies() {
		return "Prohibitionandrestrictiofofcommoditypolicies";
	}

	@RequestMapping("/index/PrivacyPolicy")
	public String PrivacyPolicy() {
		return "PrivacyPolicy";
	}

	@RequestMapping("/index/TermsService")
	public String TermsService() {
		return "TermsService";
	}
}
