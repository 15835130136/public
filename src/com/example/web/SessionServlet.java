package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServlet
 */
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SessionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
                 request.setCharacterEncoding("utf-8");
                 response.setCharacterEncoding("utf-8");
                 response.setContentType("text/html");
                 String cookie = request.getHeader("cookie");
                 System.out.println("cookie="+cookie);
                 HttpSession session = request.getSession();
                 PrintWriter writer = response.getWriter();
                 Long createTime =  session.getCreationTime();
                 Long lastTime  = session.getLastAccessedTime();
               //  session.setMaxInactiveInterval();
                 int maxTime = session.getMaxInactiveInterval();
                 
                 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                 String CreateDate = format.format(new Date(createTime));
                 String LastDate = format.format(new Date(lastTime));
    
                 
                 if(session.isNew()){
                 	 writer.println("创建新的会话");
                 }else {
                	 
                	 writer.println("Welcome  back !");
                	 
                	 //手动销毁当前会话
				//	session.invalidate();

				}

            	 writer.println("会话最后访问发送请求时间：	"+LastDate);
            	 writer.println("会话最长等待时间："+maxTime);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
