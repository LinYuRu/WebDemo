package web.app.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class AdminController {
	@RequestMapping("/adindex")
	public String adindex() {
		return "adindex";
	}
	@RequestMapping("/adindex2")
	public String adindex2() {
		return "adindex2";
	}
	@RequestMapping("/documentation/index")
	public String doindex() {
		return "documentation/index";
	}
	
	@RequestMapping("/pages/calendar")
	public String calendar() {
		return "pages/calendar";
	}
	
	@RequestMapping("/pages/widgets")
	public String widgets() {
		return "pages/widgets";
	}
	
	
	@RequestMapping("/pages/mailbox")
	public String mailbox() {
		return "pages/mailbox";
	}

	@RequestMapping("/pages/charts/chartjs")
	public String chartjs() {
		return "pages/charts/chartjs";
	}
	
	@RequestMapping("/pages/charts/flot")
	public String flot() {
		return "/pages/charts/flot";
	}
	
	@RequestMapping("/pages/charts/inline")
	public String inline() {
		return "pages/charts/inline";
	}
	
	@RequestMapping("/pages/charts/morris")
	public String morris() {
		return "pages/charts/morris";
	}
	
	@RequestMapping("/pages/examples/404")
	public String er404() {
		return "pages/examples/404";
	}
	
	@RequestMapping("/pages/examples/500")
	public String er500() {
		return "pages/examples/500";
	}
	
	@RequestMapping("/pages/examples/blank")
	public String blank() {
		return "pages/examples/blank";
	}
	
	@RequestMapping("/pages/examples/invoiceprint")
	public String invoiceprint() {
		return "pages/examples/invoiceprint";
	}
	
	@RequestMapping("/pages/examples/lockscreen")
	public String lockscreen() {
		return "pages/examples/lockscreen";
	}
	
	@RequestMapping("/pages/examples/login")
	public String adlogin() {
		return "pages/examples/login";
	}
	
	@RequestMapping("/pages/examples/register")
	public String adregister() {
		return "pages/examples/register";
	}
	
	
	@RequestMapping("/pages/forms/advanced")
	public String advanced() {
		return "pages/forms/advanced";
	}
	
	@RequestMapping("/pages/forms/editors")
	public String editors() {
		return "pages/forms/editors";
	}
	
	@RequestMapping("/pages/forms/general")
	public String adgeneral1() {
		return "pages/forms/general";
	}
	
	@RequestMapping("/pages/layout/boxed")
	public String boxed() {
		return "pages/layout/boxed";
	}
	
	@RequestMapping("/pages/layout/collapsedsidebar")
	public String collapsedsidebar() {
		return "pages/layout/collapsedsidebar";
	}
	
	@RequestMapping("/pages/layout/fixed")
	public String fixed() {
		return "pages/layout/fixed";
	}
	
	@RequestMapping("/pages/layout/topnav")
	public String topnav() {
		return "pages/layout/topnav";
	}
	
	@RequestMapping("/pages/mailbox/compose")
	public String compose() {
		return "pages/mailbox/compose";
	}
	
	@RequestMapping("/pages/mailbox/mailbox")
	public String mailbox2() {
		return "pages/mailbox/mailbox";
	}
	
	@RequestMapping("/pages/mailbox/readmail")
	public String readmail() {
		return "pages/mailbox/readmail";
	}
	
	@RequestMapping("/pages/tables/data")
	public String data() {
		return "pages/tables/data";
	}
	
	@RequestMapping("/pages/tables/simple")
	public String simple() {
		return "pages/tables/simple";
	}
	
	@RequestMapping("/pages/UI/buttons")
	public String buttons() {
		return "pages/UI/buttons";
	}
	
	@RequestMapping("/pages/UI/general")
	public String adgeneral() {
		return "pages/UI/general";
	}
	
	@RequestMapping("/pages/UI/icons")
	public String icons() {
		return "pages/UI/icons";
	}
	
	@RequestMapping("/pages/UI/modals")
	public String modals() {
		return "pages/UI/modals";
	}
	
	@RequestMapping("/pages/UI/sliders")
	public String sliders() {
		return "pages/UI/sliders";
	}
	
	@RequestMapping("/pages/UI/timeline")
	public String timeline() {
		return "pages/UI/timeline";
	}
}
