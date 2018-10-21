package com.jh.springboot04restfulcrud.config;

import com.jh.springboot04restfulcrud.component.MyLocaleResolver;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * com.jh.springboot04restfulcrud.config
 *
 * @author jh
 * @date 2018/10/11 13:19
 * description:
 */
@Configuration
public class MyConfig extends WebMvcConfigurerAdapter {

	@Bean
	public EmbeddedServletContainerCustomizer embeddedServletContainerCustomizer(){
		return new EmbeddedServletContainerCustomizer () {
			//定制嵌入式的servlet容器
			@Override
			public void customize(ConfigurableEmbeddedServletContainer container) {
				container.setPort (8080);
			}
		};
	}


	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController ("/jh").setViewName ("success");
	}

	//返回WebMvcConfigurerAdapter组件一起起作用
	@Bean//将组件注册到容器中
	public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {
		WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter () {
			@Override
			public void addViewControllers(ViewControllerRegistry registry) {
				registry.addViewController ("/").setViewName ("login");
				registry.addViewController ("/index.html").setViewName ("login");
				registry.addViewController ("/main.html").setViewName ("dashboard");
			}
		};
		return adapter;
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//注册拦截器
		//静态资源(js/css)--------->springboot已经做好静态资源映射

		//registry.addInterceptor (new LoginHandlerInterceptor ()).addPathPatterns ("/**")
		//		.excludePathPatterns ("/index.html", "/", "/user/login");
	}

	@Bean
	public LocaleResolver localeResolver() {

		return new MyLocaleResolver ();
	}
}
