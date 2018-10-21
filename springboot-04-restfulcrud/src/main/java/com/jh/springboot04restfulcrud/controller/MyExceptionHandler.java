package com.jh.springboot04restfulcrud.controller;

import com.jh.springboot04restfulcrud.exception.UserNotExistException;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandler {

	//1、浏览器客户端返回的都是json
	//@ResponseBody
	//@ExceptionHandler(UserNotExistException.class)
	//public Map<String,Object> handleException(Exception e){
	//    Map<String,Object> map = new HashMap<>();
	//    map.put("code","user.notexist");
	//    map.put("message",e.getMessage());
	//    return map;
	//}
	/*
	 * 没有自适应效果（浏览器，客户端返回的数据都是json）
	 * */
	@ExceptionHandler(UserNotExistException.class)
	public String handleException(Exception e, HttpServletRequest request) {
		Map<String, Object> map = new HashMap<> ();
		//我们要传入自己的错误状态码（默认200） 设置错误状态码
		request.setAttribute ("javax.servlet.error.status_code", 500);
		map.put ("code", "user.notexist");
		map.put ("message", "500错误，服务端异常");
		request.setAttribute ("ext",map);
		return "forward:/error";
	}
	/*
	 * 将定制的数据携带出去
	 * 1.完全编写一个errorController的实现类（子类），放入容器中。
	 * 2.页面上能用的数据，或者json返回的数据都是ErrorAttributes得到的。
	 * */

}
