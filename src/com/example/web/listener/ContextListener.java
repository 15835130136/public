package com.example.web.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.example.model.Dog;

public class ContextListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("执行上下文监听程序");
		ServletContext sc = arg0.getServletContext();
		String breed = sc.getInitParameter("breed");
		System.out.println("获取上下文配置参数breed："+breed);
		Dog dog = new Dog(breed);
		sc.setAttribute("dog", dog);
	}

}
