package com.jh.springboot07mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.jh.springboot07mybatis.mapper")
@SpringBootApplication
public class Springboot07MybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run (Springboot07MybatisApplication.class, args);
	}
}
