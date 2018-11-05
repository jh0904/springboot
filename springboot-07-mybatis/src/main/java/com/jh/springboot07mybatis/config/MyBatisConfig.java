package com.jh.springboot07mybatis.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * com.jh.springboot07mybatis.config
 *
 * @author jh
 * @date 2018/11/5 11:23
 * description:
 */
@Configuration
public class MyBatisConfig {
	@Bean
	public ConfigurationCustomizer configurationCustomizer() {
		return configuration -> configuration.setMapUnderscoreToCamelCase (true);
	}
}
