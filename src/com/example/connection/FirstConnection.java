package com.example.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FirstConnection {
	private  Connection connection = null;
	private String selectSQL = null;
	private static PreparedStatement preparedStatment=null;
	public ResultSet rs = null;
	public  void getConnection() {
		String url="jdbc:oracle:thin:@29.1.20.32:1521:orcl";
		String name="cjcbhb";
		String password = "cjcbhb";
		//连接数据库
		try {
			connection = DriverManager.getConnection(url, name, password);
			System.out.println("数据库连接成功");
		} catch (SQLException e) {
			System.out.println("数据库连接失败，请检查连接配置");
			e.printStackTrace();
		}
	}

	public  void selectSQL() throws SQLException {
		preparedStatment = connection.prepareStatement(selectSQL);
		rs = preparedStatment.executeQuery();
		String customerid =null;
		String mfcustomerid = null;
		int a = 1;
		while (rs.next()) {
			customerid=rs.getString("customerid");
			mfcustomerid = rs.getString("mfcustomerid");
			System.out.println(a+"："+customerid+","+mfcustomerid);
			a++;
			
		}
	}
	
	public void prepare(){
		 selectSQL = "select customerid,mfcustomerid from customer_info where inputdate='2021/03/21' ";
		 
	}
	
	public static void main(String[] args) throws SQLException {
		FirstConnection connection = new FirstConnection();
		connection.prepare();
		connection.getConnection();
		connection.selectSQL();
		
	}
	
}
