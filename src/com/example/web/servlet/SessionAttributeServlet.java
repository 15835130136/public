package com.example.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionAttributeServlet
 * 
 * describe:用于将表单传来的值加入到会话属性中，以测试会话属性监听
 */
public class SessionAttributeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionAttributeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	String name = null;
	String password = null;
	request.setCharacterEncoding("utf-8");
	response.setContentType("text/html");
	response.setCharacterEncoding("utf-8");
  
	HttpSession session = request.getSession();
	session.setAttribute("name", "不能为空");
	session.setAttribute("password", "不能为空");
	name = request.getParameter("name");
    password = request.getParameter("password");
    session.setAttribute("name", name);
    session.removeAttribute("password");
    PrintWriter out = response.getWriter();
    out.println("您的登录信息已经提交成功！");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
