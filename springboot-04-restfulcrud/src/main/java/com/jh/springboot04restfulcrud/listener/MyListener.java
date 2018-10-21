package com.jh.springboot04restfulcrud.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * com.jh.springboot04restfulcrud.listener
 *
 * @author jh
 * @date 2018/10/22 0:36
 * description:
 */
public class MyListener implements ServletContextListener {
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println ("contextInitialized--->启动");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println ("contextDestroyed--->销毁");
	}
}
