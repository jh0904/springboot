package com.jh.springboot04restfulcrud.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * com.jh.springboot04restfulcrud.filter
 *
 * @author jh
 * @date 2018/10/22 0:32
 * description:
 */
public class MyFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println ("doFilter----->");
		chain.doFilter (request,response);
	}

	@Override
	public void destroy() {

	}
}
