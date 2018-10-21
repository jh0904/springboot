package com.jh.springboot04restfulcrud.config;

import com.jh.springboot04restfulcrud.filter.MyFilter;
import com.jh.springboot04restfulcrud.listener.MyListener;
import com.jh.springboot04restfulcrud.servlet.MyServlet;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * com.jh.springboot04restfulcrud.config
 *
 * @author jh
 * @date 2018/10/22 0:22
 * description:
 */
@Configuration
public class MyServerConfig {
	//注册三大组件
	@Bean
	public ServletRegistrationBean myServlet() {
		ServletRegistrationBean registrationBean = new ServletRegistrationBean (new MyServlet (), "/myServlet");
		return registrationBean;
	}

	@Bean
	public FilterRegistrationBean myFilter() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean ();
		registrationBean.setFilter (new MyFilter ());
		registrationBean.setUrlPatterns (Arrays.asList ("/hello", "/myServlet"));
		return registrationBean;
	}

	@Bean
	public ServletListenerRegistrationBean MyListener() {
		ServletListenerRegistrationBean<MyListener> listenerRegistrationBean = new ServletListenerRegistrationBean<> (new MyListener ());
		return listenerRegistrationBean;
	}

	@Bean
	public EmbeddedServletContainerCustomizer embeddedServletContainerCustomizer() {
		return new EmbeddedServletContainerCustomizer () {
			//定制嵌入式的servlet容器
			@Override
			public void customize(ConfigurableEmbeddedServletContainer container) {
				container.setPort (8080);
			}
		};
	}
}
