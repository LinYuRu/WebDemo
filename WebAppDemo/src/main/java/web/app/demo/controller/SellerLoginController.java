package web.app.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.app.demo.model.LoginBean;
import web.app.demo.model.ShopFinanceBean;
import web.app.demo.service.SellerService;

@Controller
public class SellerLoginController {
	@Autowired
	SellerService sellerloginservice;
	
	@RequestMapping(value= {"/index/sellerlogin"}, method = RequestMethod.GET)
	public String getsellerlogin(Model model,HttpSession session) {
		ShopFinanceBean pb = new ShopFinanceBean();
		model.addAttribute("ShopFinanceBean", pb);
		session.setAttribute("sellerloginerr", " ");
		return "sellerlogin";
	}
	@RequestMapping(value= {"/index/sellerlogin"}, method = RequestMethod.POST)
	public String processsellerlogin(@ModelAttribute("ShopFinanceBean") ShopFinanceBean sellerlogin,HttpSession session) {
		
		sellerlogin = sellerloginservice.sellerlogin(sellerlogin);
		if (sellerlogin.getRes()) {
			session.setAttribute("memberacc", sellerlogin.getShopAccount());
			session.setAttribute("LoginOK", sellerlogin.getRes());
			session.setAttribute("sellername", sellerlogin.getShopAccount());
			session.setAttribute("logout", "logout");
			session.setAttribute("style", "none");
			return "redirect:/index";	
		}else {
			session.setAttribute("sellerloginerr", "帳號或密碼有誤，請重新輸入!");
			return "sellerlogin";
		}	   
	}
}
