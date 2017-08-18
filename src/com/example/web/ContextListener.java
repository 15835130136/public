package com.example.web;

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
		System.out.println("ִ�м�������");
		ServletContext sc = arg0.getServletContext();
		String breed = sc.getInitParameter("breed");
		System.out.println("breed��"+breed);
		Dog dog = new Dog(breed);
		sc.setAttribute("dog", dog);
	}

}
