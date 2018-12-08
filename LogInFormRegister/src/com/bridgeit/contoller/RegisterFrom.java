package com.bridgeit.contoller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterFrom extends HttpServlet{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest request ,HttpServletResponse response) throws IOException
	{
	response.setContentType("text/html");	
	PrintWriter printWriter=response.getWriter();
	 String firstName=request.getParameter("firstname");
	 String lastName=request.getParameter("lastname");
	 String  email=request.getParameter("email");
	 String password=request.getParameter("password");
	 String  role=request.getParameter("role");
	 int flag=0;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
	System.out.println(connection);
		PreparedStatement ps=connection.prepareStatement("select * from servlet");
		System.out.println(ps);
		ResultSet rs=ps.executeQuery();
		System.out.println("aaqq"+flag);
		System.out.println(rs);
		System.out.println("aa");
	/*	while(rs.next()!=false) {
		System.out.println(rs.getString(4));s
		}*/
		
		
		while(rs.next()!=false) {
			if(rs.getString(4).equals(email)) {
				System.out.println("ss");
				printWriter.println("already this email is register enter new one ");
			RequestDispatcher dispatcher=request.getRequestDispatcher("/register.html");
			dispatcher.include(request, response);
			flag=1;
			}	
			
		}
		System.out.println(flag);
		if(flag==0)
		{
		
		System.out.println("ssss");
		PreparedStatement preparedStatement=connection.prepareStatement("insert into  servlet(firstname,lastname,email,password,role) values(?,?,?,?,?)");
		preparedStatement.setString(1, firstName);
		preparedStatement.setString(2, lastName);
		preparedStatement.setString(3, email);
		preparedStatement.setString(4, password);
		preparedStatement.setString(5, role);
		int i = preparedStatement.executeUpdate();
	    if (i > 0)
	        printWriter.print("You are successfully registered...");
	}}
	
	
	
	
	
	catch (Exception e) {
		// TODO: handle exception
	}
	printWriter.close();
	}

}
