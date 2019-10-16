package web.app.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import web.app.demo.model.LoginBean;
import web.app.demo.model.PersonalMemberBean;
import web.app.demo.service.LoginService;
import web.app.demo.service.PersonalMemberService;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes(value = { "PersonalMemberBean" })
public class PersonalMemberController {
	@Autowired
	PersonalMemberService service;
	@Autowired
	LoginService loginservice;
	
	
	 
	@RequestMapping(value= {"/index/register"}, method = RequestMethod.GET)
	public String getNewMemberForm(Model model) {
		PersonalMemberBean mb = new PersonalMemberBean();
		model.addAttribute("PersonalMemberBean", mb);
		return "register";
	}
	             
	@RequestMapping(value= {"/index/register" }, method = RequestMethod.POST)
	public String processNewMemberForm(@ModelAttribute("PersonalMemberBean") PersonalMemberBean member,
			String memberPassword, Model model, HttpServletRequest request,
			BindingResult bindingResult) {
//		@SessionAttribute(value = "ShopId") Integer shopId, 
//		service.addPersonalMember(member);
//		return "redirect:/redirectIndex";
		
		Map<String, String> errors = new HashMap<>();
		model.addAttribute("errorMsgs", errors);

		if (bindingResult != null && bindingResult.hasFieldErrors()) {
			if (bindingResult.hasFieldErrors("memberEmail")) {
				errors.put("memberEmail", "EMAIL必須輸入");
			}
			if (bindingResult.hasFieldErrors("memberPassword")) {
				errors.put("memberPassword", "Password必須是英文字");
			}			
		}
		// 驗證資料
		String account = member.getMemberAccount();
		if ("".equals(account)) {
			errors.put("memberAccount", "帳號必須輸入");
		}
		if (account.trim().length()>15) {
			errors.put("memberAccount", "帳號長度最多15個字");
		}
		String name = member.getMemberName();
		if ("".equals(name)) {
			errors.put("memberName", "姓名必須輸入");
		}
		if ("".equals(memberPassword)) {
			errors.put("Pwd", "密碼必須輸入");
		}
		if (memberPassword.trim().length()<6||memberPassword.trim().length()>15) {
			errors.put("Pwd", "密碼長度必須大於等於6小於等於15");
		}
		
		String email=member.getMemberEmail();
		if ("".equals(email)) {
			errors.put("memberEmail", "信箱必須輸入");
		}
		
		
		if (errors != null && !errors.isEmpty()) {
			System.out.println("register fail" + errors);
			return "register.input";
		}
		// 呼叫model
		// 生成驗證碼
//		String code = CodeUtil.generateUniqueCode();
//		member.setVerificationCode(code);
		
		member.setMemberUpdateTime(new java.sql.Timestamp(System.currentTimeMillis()));
//		member.setShopId(shopId);
//		bean.setShopId(1);
//		PersonalMemberBean member1 = service.idExists(memberPassword);
//		System.out.println("memberId="+member.getMemberId());
//		if (member1 == null) {
//			System.out.println("帳號新增失敗:帳號已存在");
//			errors.put("memberAccount", "帳號已存在");
//			return "register.input";
//		} else {
//			String root = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()+request.getContextPath();
//			javaMailAsyncService.sendEmail(member.getMemberEmail(), code,bean.getMemberName(),shopname,root);
			model.addAttribute("PersonalMemberBean", member);
//			System.out.println("no index");
			return "member";
		}
	

	@RequestMapping(value= {"/index/member"}, method = RequestMethod.GET)
	public String getNewMemberForm1(Model model) {
		return "member";
	}
	
	@RequestMapping(value= {"/index/login"}, method = RequestMethod.GET)
	public String getlogin(Model model,HttpSession session) {
		LoginBean pb = new LoginBean();
		model.addAttribute("LoginBean", pb);
		session.setAttribute("loginerr", " ");
		return "login";
	}
	
	@RequestMapping(value= {"/index/login"}, method = RequestMethod.POST)
	public String processlogin(@ModelAttribute("LoginBean") LoginBean login,HttpSession session) {
		
		login = loginservice.login(login);
		if (login.getRes()) {
			session.setAttribute("memberacc", login.getMemberAccount());
			session.setAttribute("LoginOK", login.getRes());
			session.setAttribute("username", login.getMemberAccount());
			session.setAttribute("memberEmail", login.getMemberEmail());
			session.setAttribute("memberId", login.getMemberId());
			session.setAttribute("logout", "logout");
			session.setAttribute("style", "none");
			return "redirect:/index";	
		}else {
			session.setAttribute("loginerr", "帳號或密碼有誤，請重新輸入!");
			return "login";
		}	   
	}
	
	
	@RequestMapping(value= {"/index/logout", "/index/index/logout"})
	public String logout(HttpSession session) {
		boolean fal = false;
		session.setAttribute("LoginOK",fal);
		session.setAttribute("memberacc", "");
		session.setAttribute("username", "");
		session.setAttribute("memberEmail","");
		session.setAttribute("memberId", "");
		session.setAttribute("logout", " ");
		session.setAttribute("style", "block");
		return "redirect:/index";
	}
	@InitBinder
	public void whiteListing(WebDataBinder binder) {
		binder.setAllowedFields(
				"memberEmail",
				"memberAccount",
				"memberPassword",
				"memberName",
				"memberBirth"
//				,"memberImage"
				);
	}
}
