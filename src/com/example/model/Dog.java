package com.example.model;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Dog implements HttpSessionBindingListener {
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
	public void valueBound(HttpSessionBindingEvent arg0) {
		System.out.println("session：dog属性已经添加至这个会话中");

	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		System.out.println("session：dog属性已从当前会话中移除");

	}

}
