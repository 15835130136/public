package com.example.web.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 1.会话计数练习，用于计数访问该应用的所有会话个数。
 * 2.实现接口：HttpSessionListener
 * 3.实现方式：使用一个静态变量充当计数，每新增一个会话累加一次，每销毁一个会话累减一次
 */
public class CountSessionListener implements HttpSessionListener {

    /**
     * Default constructor. 
     */
	private static int activeSessions;//session静态计数器
	public static int getActiveSession(){
		return activeSessions;
	}
    public CountSessionListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    	activeSessions++;
    	System.out.println("新建了一个会话，当前会话个数"+activeSessions);

    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    	activeSessions--;
    	System.out.println("销毁了一个会话，当前会话个数"+activeSessions);

    }
	
}
