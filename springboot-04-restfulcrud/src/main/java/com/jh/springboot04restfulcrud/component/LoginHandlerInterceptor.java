package com.jh.springboot04restfulcrud.component;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * com.jh.springboot04restfulcrud.component
 *
 * @author jh
 * @date 2018/10/15 23:22
 * description:
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException, IOException {
		HttpSession session = request.getSession ();
		Object user = session.getAttribute ("loginUser");
		if(user==null){
			//未登录，返回登录页面
			request.setAttribute ("msg","没有权限登录!!!");
			request.getRequestDispatcher ("/index.html").forward (request,response);
			return false;
		}else {
			return true;
		}

	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

	}
}
