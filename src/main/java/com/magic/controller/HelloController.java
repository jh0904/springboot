package com.magic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * com.magic.controller
 *
 * @author jh
 * @date 2018/9/25 11:10
 * description:
 */
@Controller
public class HelloController {
	@ResponseBody
	@RequestMapping("/hello")
	public String hello(){
		return "hello magic";
	}
}
