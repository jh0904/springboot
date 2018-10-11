package com.jh.springboot04restfulcrud.config;

import com.jh.springboot04restfulcrud.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
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
				registry.addViewController ("/login.html").setViewName ("login");

			}
		};
		return adapter;
	}

	@Bean
	public LocaleResolver localeResolver(){

		return new MyLocaleResolver();
	}
}
