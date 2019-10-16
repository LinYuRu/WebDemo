package web.app.demo.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.*;

import web.app.demo.model.PersonalMemberBean;




@WebFilter(urlPatterns = { "/*" },initParams = {  
		@WebInitParam(name = "mustLogin2", value = "/fourcol"), 
		@WebInitParam(name = "mustLogin3", value = "/products/addProduct"),
		@WebInitParam(name = "mustLogin5", value = "/Admin/*")
})
public class LoginCheckingFilter implements Filter{
	
	List<String> url = new ArrayList<String>();
	String servletPath;
	String contextPath;
	String requestURI;

	public void init(FilterConfig fConfig) throws ServletException {
		Enumeration<String> e = fConfig.getInitParameterNames();
		while (e.hasMoreElements()) {
			String path = e.nextElement();
			url.add(fConfig.getInitParameter(path));
		}
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		boolean isRequestedSessionIdValid = false;
		if (request instanceof HttpServletRequest
				&& response instanceof HttpServletResponse) {
			HttpServletRequest req = (HttpServletRequest) request;
			HttpServletResponse resp = (HttpServletResponse) response;
			servletPath = req.getServletPath();  
			contextPath = req.getContextPath();
			requestURI  = req.getRequestURI();
			isRequestedSessionIdValid = req.isRequestedSessionIdValid();

			if (mustLogin()) {           
				if (checkLogin(req)) {   
					//  需要登入，但已經登入
					chain.doFilter(request, response);
				} else {				
					//  需要登入，尚未登入，所以送回登入畫面
					HttpSession session = req.getSession();
				    
					
					if ( ! isRequestedSessionIdValid ) {
						session.setAttribute("timeOut", "使用逾時，請重新登入");
					} else {
						// 記住原本的"requestURI"，稍後如果登入成功，系統可以自動轉入
						// 原本要執行的程式。
						session.setAttribute("requestURI", requestURI);	
					}
				//	resp.sendRedirect("/WebAppDemo/index/login");
					resp.sendRedirect("/WebAppDemo/index/login");
					return;
				}
			} else {   //不需要登入，直接去執行他要執行的程式
				chain.doFilter(request, response);
			}
		} else {
			throw new ServletException("Request/Response 型態錯誤(極不可能發生)");
		}
	}
	// 判斷Session物件內是否含有識別字串為LoginOK的屬性物件，如果有，表示已經登入，否則尚未登入
	private boolean checkLogin(HttpServletRequest req) {
		HttpSession session = req.getSession();
		
		//如果沒有任何登入過程，把LoginOK預設成false
		if(session.getAttribute("LoginOK") == null) {
		boolean fal = false;
		session.setAttribute("LoginOK",fal);
		}
		//取得LoginOK
		boolean loginToken = (boolean) session.getAttribute("LoginOK");
		
		if (loginToken == true) {
			return true;
		}
		
		return false;
	}

	// 如果請求的ServletPath的前導字是以某個必須登入才能使用之資源的路徑，那就必須登入。
	private boolean mustLogin() {
		boolean login = false;
		for (String sURL : url) {
			if (sURL.endsWith("*")) {
				sURL = sURL.substring(0, sURL.length() - 1); // 除去掉最後一個字元的剩餘字串
				if (servletPath.startsWith(sURL)) {
					login = true;
					break;
				}
			} else {
				if (servletPath.equals(sURL)) {
					login = true;
					break;
				}
			}
		}
		return login;
	}
	@Override
	public void destroy() {
	}

	

}
