package com.example.model;

import java.io.Serializable;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;

public class Dog implements HttpSessionBindingListener,HttpSessionActivationListener, Serializable{
	private String breed = null;

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Dog(String breed) {
		super();
		this.breed = breed;
	}

	public Dog() {
	}

	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		String sessionID = event.getSession().getId();
		System.out.println("session：dog属性已经添加至这个会话中，会话id为："+sessionID);

	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		String sessionID = event.getSession().getId();
		System.out.println("session：dog属性已从当前会话中移除，会话id为："+sessionID);

	}

	@Override
	/*
	 * 会话激活事件，实现自会话迁移接口
	 */
	public void sessionDidActivate(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	/*
	 * 会话激活事件，实现自会话迁移接口
	 */
	public void sessionWillPassivate(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
