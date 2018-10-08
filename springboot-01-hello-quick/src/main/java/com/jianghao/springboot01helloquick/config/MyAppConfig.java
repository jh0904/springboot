package com.jianghao.springboot01helloquick.config;

import com.jianghao.springboot01helloquick.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * com.jianghao.springboot01helloquick.config
 *
 * @author jh
 * @date 2018/9/26 10:43
 * description:@Configuration指明当前类是一个配置类，用来替代之前的Spring配置文件
 */
@Configuration
public class MyAppConfig {
	//将方法的返回值添加到容器中，容器中默认的id就是方法名
	@Bean
	public HelloService helloService() {
		System.out.println ("配置类");
		return new HelloService ();
	}

}
