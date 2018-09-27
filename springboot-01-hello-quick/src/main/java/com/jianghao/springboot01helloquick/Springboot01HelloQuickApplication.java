package com.jianghao.springboot01helloquick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class Springboot01HelloQuickApplication {

	public static void main(String[] args) {
		SpringApplication.run (Springboot01HelloQuickApplication.class, args);
	}
}
