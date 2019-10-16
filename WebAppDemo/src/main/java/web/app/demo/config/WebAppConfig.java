package web.app.demo.config;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Configuration
@EnableWebMvc
//@EnableAspectJAutoProxy
@ComponentScan("web.app.demo")
public class WebAppConfig extends WebMvcConfigurerAdapter {
	@Bean
	public  ViewResolver  internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setExposeContextBeansAsAttributes(true);
		return resolver;
	}
	
	@Bean
	public CommonsMultipartResolver multipartResolver() {
		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
		resolver.setDefaultEncoding("UTF-8");
		resolver.setMaxUploadSizePerFile(81920000);
		resolver.setMaxInMemorySize(4096);
		return resolver;
	}
	
//	 @Override
//	    public void addInterceptors(InterceptorRegistry registry) {
//	        registry.addInterceptor(new SystemInterceptor()).addPathPatterns("/*");
//	    }
	
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource resource = new ResourceBundleMessageSource();
		resource.setBasename("messages");
		return resource;
	}

	@Bean
	public MappingJackson2JsonView jsonView() {
		MappingJackson2JsonView view = new MappingJackson2JsonView();
		view.setPrettyPrint(true);
		return view;
	}
	
	@Bean
	public ViewResolver contentNegotiatingViewResolver(ContentNegotiationManager manager) {
		ContentNegotiatingViewResolver resolver = new ContentNegotiatingViewResolver();
		resolver.setContentNegotiationManager(manager);
		ArrayList<View> views = new ArrayList<>();
		views.add(jsonView());
		resolver.setDefaultViews(views);
		return resolver;
	}
	
//	 @Bean
//	 public PolicyFactory htmlPolicy() {
//	        return new HtmlPolicyBuilder()
//	                    .allowElements("a", "b", "i", "del", "pre", "code")
//	                    .allowUrlProtocols("http", "https")
//	                    .allowAttributes("href").onElements("a")
//	                    .requireRelNofollowOnLinks()
//	                    .toFactory();
//	    }

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//前端網頁
		registry.addResourceHandler("/css/**").addResourceLocations("/WEB-INF/views/css/");
		registry.addResourceHandler("/img/**").addResourceLocations("/WEB-INF/views/img/");
		registry.addResourceHandler("/font-awesome/**").addResourceLocations("/WEB-INF/views/font-awesome/");
		registry.addResourceHandler("/ico/**").addResourceLocations("/WEB-INF/views/ico/");
		registry.addResourceHandler("/js/**").addResourceLocations("/WEB-INF/views/js/");
		//後台
		registry.addResourceHandler("/css/**").addResourceLocations("/WEB-INF/views/css/");
		registry.addResourceHandler("/img/**").addResourceLocations("/WEB-INF/views/img/");
		registry.addResourceHandler("/font-awesome/**").addResourceLocations("/WEB-INF/views/font-awesome/");
		registry.addResourceHandler("/ico/**").addResourceLocations("/WEB-INF/views/ico/");
		registry.addResourceHandler("/js/**").addResourceLocations("/WEB-INF/views/js/");
		registry.addResourceHandler("/block/**").addResourceLocations("/WEB-INF/views/block/");
		registry.addResourceHandler("/bootstrap/css/**").addResourceLocations("/WEB-INF/views/bootstrap/css/");
		registry.addResourceHandler("/bootstrap/js/**").addResourceLocations("/WEB-INF/views/bootstrap/js/");
		registry.addResourceHandler("/dist/css/**").addResourceLocations("/WEB-INF/views/dist/css/");
		registry.addResourceHandler("/dist/css/skins/**").addResourceLocations("/WEB-INF/views/dist/css/skins/");
		registry.addResourceHandler("/dist/img/**").addResourceLocations("/WEB-INF/views/dist/img/");
		registry.addResourceHandler("/dist/js/**").addResourceLocations("/WEB-INF/views/dist/js/");
		registry.addResourceHandler("/dist/js/pages/**").addResourceLocations("/WEB-INF/views/dist/js/pages/");
		registry.addResourceHandler("/plugins/iCheck/flat/**").addResourceLocations("/WEB-INF/views/plugins/iCheck/flat/");
		registry.addResourceHandler("/plugins/iCheck/**").addResourceLocations("/WEB-INF/views/plugins/iCheck/");
		registry.addResourceHandler("/plugins/chartjs/**").addResourceLocations("/WEB-INF/views/plugins/chartjs/");
		registry.addResourceHandler("/plugins/morris/**").addResourceLocations("/WEB-INF/views/plugins/morris/");
		registry.addResourceHandler("/plugins/jvectormap/**").addResourceLocations("/WEB-INF/views/plugins/jvectormap/");
		registry.addResourceHandler("/plugins/datepicker/**").addResourceLocations("/WEB-INF/views/plugins/datepicker/");
		registry.addResourceHandler("/plugins/daterangepicker/**").addResourceLocations("/WEB-INF/views/plugins/daterangepicker/");
		registry.addResourceHandler("/plugins/bootstrapwysihtml5/**").addResourceLocations("/WEB-INF/views/plugins/bootstrapwysihtml5/");
		registry.addResourceHandler("/plugins/bootstrapslider/**").addResourceLocations("/WEB-INF/views/plugins/bootstrapslider/");
		registry.addResourceHandler("/plugins/morris/**").addResourceLocations("/WEB-INF/views/plugins/morris/");
		registry.addResourceHandler("/plugins/jQuery/**").addResourceLocations("/WEB-INF/views/plugins/jQuery/");
		registry.addResourceHandler("/plugins/sparkline/**").addResourceLocations("/WEB-INF/views/plugins/sparkline/");
		registry.addResourceHandler("/plugins/knob/**").addResourceLocations("/WEB-INF/views/plugins/knob/");
		registry.addResourceHandler("/plugins/slimScroll/**").addResourceLocations("/WEB-INF/views/plugins/slimScroll/");
		registry.addResourceHandler("/plugins/fastclick/**").addResourceLocations("/WEB-INF/views/plugins/fastclick/");
		registry.addResourceHandler("/plugins/inputmask/**").addResourceLocations("/WEB-INF/views/plugins/inputmask/");
		registry.addResourceHandler("/plugins/colorpicker/**").addResourceLocations("/WEB-INF/views/plugins/colorpicker/");
		registry.addResourceHandler("/plugins/slimScroll/**").addResourceLocations("/WEB-INF/views/plugins/slimScroll/");
		registry.addResourceHandler("/pages/layout/**").addResourceLocations("/WEB-INF/views/pages/layout/");
		registry.addResourceHandler("/pages/**").addResourceLocations("/WEB-INF/views/pages/");
		registry.addResourceHandler("/pages/charts/**").addResourceLocations("/WEB-INF/views/pages/charts/");
		registry.addResourceHandler("/pages/UI/**").addResourceLocations("/WEB-INF/views/pages/UI/");
		registry.addResourceHandler("/pages/forms/**").addResourceLocations("/WEB-INF/views/pages/forms/");
		registry.addResourceHandler("/pages/tables/**").addResourceLocations("/WEB-INF/views/pages/tables/");
		registry.addResourceHandler("/pages/mailbox/**").addResourceLocations("/WEB-INF/views/pages/mailbox/");
		registry.addResourceHandler("/pages/examples/**").addResourceLocations("/WEB-INF/views/pages/examples/");
		registry.addResourceHandler("/pages/forms/**").addResourceLocations("/WEB-INF/views/pages/forms/");
		registry.addResourceHandler("/documentation/**").addResourceLocations("/WEB-INF/views/documentation/");
	}

	
}

