package com.jh.springboot04restfulcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * com.jh.springboot04restfulcrud.controller
 *
 * @author jh
 * @date 2018/10/11 18:55
 * description:
 */
@Controller
public class LoginController {
	@PostMapping(value = "/user/login")
	//@RequestMapping(value = "/user/login")
	public String login(@RequestParam("username") String username, @RequestParam("password") String password, Map<String,Object> map, HttpSession session) {
		if(!StringUtils.isEmpty (username)&&"123456".equals (password)){
			//防止表单重复提交，可以重定向到页面。
			session.setAttribute ("loginUser",username);
			return "redirect:/main.html";
		}else {
			map.put ("msg","密码错误");
			return "login";
		}

	}
}
