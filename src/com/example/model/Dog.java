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
		System.out.println("session��dog�����Ѿ����������Ự�У��ỰidΪ��"+sessionID);

	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		String sessionID = event.getSession().getId();
		System.out.println("session��dog�����Ѵӵ�ǰ�Ự���Ƴ����ỰidΪ��"+sessionID);

	}

	@Override
	/*
	 * �Ự�����¼���ʵ���ԻỰǨ�ƽӿ�
	 */
	public void sessionDidActivate(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	/*
	 * �Ự�����¼���ʵ���ԻỰǨ�ƽӿ�
	 */
	public void sessionWillPassivate(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
