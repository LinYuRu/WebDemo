package web.app.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller    
public class HomeController {
	
	@RequestMapping(value = {"/forwardIndex"})
	public String index() {
		return "index";
	}
	@RequestMapping(value = {"/serviceterm"})
	public String serviceterm() {
		return "serviceterm";
	}
//	@RequestMapping("/")
//	public String home() {
//		return "index";
//	}
//	@RequestMapping("/footer")
//	public String footer() {
//		return "footer";
//	}
//	@RequestMapping("/addProduct")
//	public String addProduct() {
//		return "addProduct";
//	}
	@RequestMapping("/aboutus")
	public String aboutus() {
		return "aboutus";
	}
	@RequestMapping("/cart")
	public String cart() {
		return "cart";
	}
	@RequestMapping("/compair")
	public String compair() {
		return "compair";
	}
	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
	@RequestMapping("/forgetpassword")
	public String forgetpassword() {
		return "forgetpassword";
	}
//	@RequestMapping("/fourcol")
//	public String fourcol() {
//		return "fourcol";
//	}
	@RequestMapping("/general")
	public String general() {
		return "general";
	}
	@RequestMapping("/gridview")
	public String gridview() {
		return "gridview";
	}
	@RequestMapping("/header")
	public String header(HttpSession session) {
		session.setAttribute("username", "Login");
		return "header";
	}
//	@RequestMapping("/listview")
//	public String listview() {
//		return "listview";
//	}
//	@RequestMapping("/login")
//	public String login() {
//		return "login";
//	}
//	@RequestMapping("/register")
//	public String register() {
//		return "register";
//	}
//	@RequestMapping("/sidebar")
//	public String sidebar() {
//		return "sidebar";
//	}
//	@RequestMapping("/threecol")
//	public String threecol() {
//		return "threecol";
//	}
	
}
