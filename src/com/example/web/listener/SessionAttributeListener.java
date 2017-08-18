package com.example.web.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class SessionAttributeListener
 * 
 * describe�������Ự������ӡ��޸ġ�ɾ���ļ�������
 * ʵ�ֽӿڣ�ʵ����HttpSessionAtttibuteListener
 * ʵ�֣�
 *   1.HttpSessionBindingEvent�����������ڻ�ȡ�Ự����name��value�ķ�����
 *   2.��ӡ��޸ġ�ɾ�������¼�����������Ӧ�ķ�������������ִ�С�
 * 
 *
 */
public class SessionAttributeListener implements HttpSessionAttributeListener {

    /**
     * Default constructor. 
     */
    public SessionAttributeListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent event)  { 
         // TODO Auto-generated method stub
    	String name = event.getName();
    	Object value = event.getValue();
    	System.out.println("������һ���Ự���ԣ�"+name+"_"+value);
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent event)  { 
         // TODO Auto-generated method stub
    	String name = event.getName();
    	Object value = event.getValue();
    	System.out.println("������һ���Ự���ԣ�"+name+"_"+value);
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent event)  { 
         // TODO Auto-generated method stub
    	String name = event.getName();
    	Object value = event.getValue();
    	System.out.println("�޸���һ���Ự���ԣ�"+name+"_"+value);
    }
	
}
