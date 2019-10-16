package web.app.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import web.app.demo.model.ShopFinanceBean;
import web.app.demo.service.SellerService;

@Controller
@SessionAttributes(value={"shopId"})
public class SellerController {
	@Autowired
	SellerService service;
	
	@RequestMapping(value="/index/AddSeller", method = RequestMethod.GET)
	public String getNewShopForm(Model model) {
		ShopFinanceBean sf = new ShopFinanceBean();
		model.addAttribute("ShopFinanceBean", sf);
		return "Sellregister";
	}
	
	@RequestMapping(value="/index/AddSeller", method = RequestMethod.POST)
	public String processNewShopForm(@ModelAttribute("ShopFinanceBean") ShopFinanceBean sf) {
		if(sf.getShopPassword() == null) {
			sf.setShopPassword("Do!ng123");
		}
		service.addSeller(sf);
		return "redirect:/threecol";
	}
	
	@RequestMapping(value="/seller/sellerProducts")
	public String getProductsByShopId(@RequestParam("shopId") Integer shopId, Model model) {
		model.addAttribute("sellerProduct", service.getProductByshopId(shopId));
		return "sellerProducts";
	}
	
	@RequestMapping("/seller")
	public String getSellerById(@RequestParam("shopId") Integer shopId, Model model) {
		model.addAttribute("seller", service.getSellerById(shopId));
		return "seller";
	}

}
