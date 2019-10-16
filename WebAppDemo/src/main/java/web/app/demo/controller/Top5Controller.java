package web.app.demo.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import web.app.demo.model.ProductBean;
import web.app.demo.model.Top5SellBean;
import web.app.demo.service.ProductService;
import web.app.demo.service.Top5Service;

@Controller
public class Top5Controller {
	@Autowired
	Top5Service service;
	
	@Autowired
	ProductService serviceP;
	
	@Autowired
	ServletContext context;
	
	@RequestMapping(value = { "/redirectIndex" })
	public String allTop5list(Model model) {
		List<Top5SellBean> list = service.getAllTop5s();
		model.addAttribute("top5", list);
		return "forward:/forwardIndex";
	}
	
	@RequestMapping(value = { "/top5Product" })
	public String getTop5ById(@RequestParam("top5Id") Integer top5Id, Model model) {
		model.addAttribute("top5", service.getTop5ById(top5Id));
		List<String> list = serviceP.getAllCategories();
		model.addAttribute("categoryDefualt", list);
		return "top5Product";
	}
	
//	@RequestMapping(value = {"/top5Product/products/{categoryDefualt}"})
//	public String getTop5CategoryList(@PathVariable("categoryDefualt") String categoryDefualt, Model model) {
//		List<ProductBean> products = serviceP.getProductsByCategory(categoryDefualt);
//		model.addAttribute("products", products);
//		return "redirect:/products";
//	}
//	
//	@RequestMapping(value = { "/top5Product", 
//			"/top5Product/listview", "/top5Product/fourcol",
//			"/top5Product/threecol/index", "/top5Product/products"})
//	public String getCategoryList(Model model) {
//		List<String> list = serviceP.getAllCategories();
//		model.addAttribute("categoryDefualt", list);
//		return "forward:/forwardtop5";
//	}
	
	@RequestMapping(value="/getTop5Picture/{top5Id}", method=RequestMethod.GET)
	public ResponseEntity<byte[]> getTop5Picture(HttpServletResponse resp, @PathVariable Integer top5Id){
		String filePath = "/resources/images/NoImage.jpg";
		byte[]media = null;
		HttpHeaders headers = new HttpHeaders();
		String filename = "";
		int len = 0;
		Top5SellBean bean = service.getTop5ById(top5Id);
		if(bean != null) {
			Blob blob = bean.getTop5CoverImg();
			filename = bean.getTop5fileName();
			if(blob != null) {
				try {
					len = (int)blob.length();
					media = blob.getBytes(1, len);
				}catch(SQLException e) {
					throw new RuntimeException("Top5Controller的getPicture()發生錯誤SQLException"+e.getMessage());
				}
			}else {
				media = toByteArray(filePath);
				filename = filePath;
			}
		}else {
			media = toByteArray(filePath);
			filename = filePath;
		}
		headers.setCacheControl(CacheControl.noCache().getHeaderValue());
	       String mimeType = context.getMimeType(filename);
	    MediaType mediaType = MediaType.valueOf(mimeType);
	    System.out.println("mediaType =" + mediaType);
	    headers.setContentType(mediaType);
	    ResponseEntity<byte[]> responseEntity = 
	                new ResponseEntity<>(media, headers, HttpStatus.OK);
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

}
