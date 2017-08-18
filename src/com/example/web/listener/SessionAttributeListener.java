package com.example.web.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class SessionAttributeListener
 * 
 * describe：监听会话属性添加、修改、删除的监听案例
 * 实现接口：实现了HttpSessionAtttibuteListener
 * 实现：
 *   1.HttpSessionBindingEvent对象中有用于获取会话属性name和value的方法。
 *   2.添加、修改、删除属性事件发生后，有响应的方法监听到，并执行。
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
    	System.out.println("销毁了一个会话属性："+name+"_"+value);
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent event)  { 
         // TODO Auto-generated method stub
    	String name = event.getName();
    	Object value = event.getValue();
    	System.out.println("新增了一个会话属性："+name+"_"+value);
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent event)  { 
         // TODO Auto-generated method stub
    	String name = event.getName();
    	Object value = event.getValue();
    	System.out.println("修改了一个会话属性："+name+"_"+value);
    }
	
}
