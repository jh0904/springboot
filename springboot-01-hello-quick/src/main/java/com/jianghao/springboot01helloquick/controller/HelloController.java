package com.jianghao.springboot01helloquick.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.jianghao.springboot01helloquick
 *
 * @author jh
 * @date 2018/9/25 16:02
 * description:
 */
/*@Controller
@ResponseBody*/
@RestController
public class HelloController {
@Value ("${person.last-name}")
	private String name;
	@RequestMapping("/zzz")
	public String hello(){
		return "hello  "+name;
	}
}
