package com.example.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetInitServlet
 */
public class GetInitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetInitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setCharacterEncoding("utf-8");
    response.setCharacterEncoding("utf-8");
    response.setContentType("text/html");
	ServletConfig  config	= getServletConfig(); 
	PrintWriter writer = response.getWriter();
	String username = config.getInitParameter("username");
	String password = config.getInitParameter("password");
	Enumeration<String> servletInit = config.getInitParameterNames();
	Enumeration<String>contextInit = getServletContext().getInitParameterNames();
    writer.println("<center><P>�������Ĳ����ļ�������Ϣ<P><br></center>");
    //����servlet����
	while(servletInit.hasMoreElements()){
		String y  = servletInit.nextElement();
		writer.println("<br>serlvet�����ļ���servlet������"+y+":"+config.getInitParameter(y));
	}
	//����context����
	while(contextInit.hasMoreElements()){
		String init = contextInit.nextElement();
		writer.println("<br>servlet�����ļ���context������"+init+"��"+getServletContext().getInitParameter(init));
	}
	


    
    
    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
