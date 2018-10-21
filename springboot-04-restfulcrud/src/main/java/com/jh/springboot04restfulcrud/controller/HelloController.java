package com.jh.springboot04restfulcrud.controller;

import com.jh.springboot04restfulcrud.exception.UserNotExistException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;

/**
 * com.jh.springboot04restfulcrud.controller
 *
 * @author jh
 * @date 2018/10/10 14:47
 * description:
 */
@RestController
public class HelloController {

/*	@RequestMapping("/")
	public String index(){
		return "index";
	}*/

	@ResponseBody
	@RequestMapping("hello")
	public String hello(@RequestParam("user") String user) {
		if(user.equals ("aaa")){
			throw new UserNotExistException ();
		}
		return "hello";
	}

	//查出数据在页面显示
	@RequestMapping("/success")
	public String success(Map<String, Object> map) {
		map.put ("hello", "<h2>你好</h2>");
		map.put ("users", Arrays.asList ("aa","bb","cc"));
		return "success";
	}


}
