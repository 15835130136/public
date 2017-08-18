package com.example.web.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 1.�Ự������ϰ�����ڼ������ʸ�Ӧ�õ����лỰ������
 * 2.ʵ�ֽӿڣ�HttpSessionListener
 * 3.ʵ�ַ�ʽ��ʹ��һ����̬�����䵱������ÿ����һ���Ự�ۼ�һ�Σ�ÿ����һ���Ự�ۼ�һ��
 */
public class CountSessionListener implements HttpSessionListener {

    /**
     * Default constructor. 
     */
	private static int activeSessions;//session��̬������
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
    	System.out.println("�½���һ���Ự����ǰ�Ự����"+activeSessions);

    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    	activeSessions--;
    	System.out.println("������һ���Ự����ǰ�Ự����"+activeSessions);

    }
	
}
