package web.app.demo.config;
import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
// 本類別的詳細說明，請參考第一章
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    
    protected Class<?>[] getRootConfigClasses() {
    	return new Class[]{RootAppConfig.class};
    }
    @Override       // 取代Spring的組態檔
    protected Class<?>[] getServletConfigClasses() {   
        return new Class[]{WebAppConfig.class};
    }
    @Override  
    // 表示分派器要處理所有請求。
    protected String[] getServletMappings() {    
        return new String[]{"/"};
    }
    @Override     //解決中文亂碼問題
    protected Filter[] getServletFilters() {
    	CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
    	characterEncodingFilter.setEncoding("UTF-8");
    	characterEncodingFilter.setForceEncoding(true);
    	return new Filter[] {characterEncodingFilter};
    	
    }
}
