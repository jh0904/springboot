package com.jh.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * com.jh.springboot.controller
 *
 * @author jh
 * @date 2018/10/24 11:13
 * description:
 */
@Controller
public class HelloController {
	@GetMapping("/abc")
	public String hello(Model model){
		model.addAttribute ("msg","你好");
		return "success";
	}
}
