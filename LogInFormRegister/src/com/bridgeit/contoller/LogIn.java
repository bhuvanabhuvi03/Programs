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


public class LogIn extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public  void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		int flag=0;
	    try {
	        Class.forName("com.mysql.jdbc.Driver");
	       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			
	        PreparedStatement ps = con
	                .prepareStatement("select * from servlet");
	        //System.out.println(ps);
	        ResultSet resultSet=ps.executeQuery();
	        //System.out.println(resultSet);
	while(resultSet.next()) {
		//System.out.println("aa");
		if(resultSet.getString(4).equals(email)&&resultSet.getString(5).equals(password)) {
		//	System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4)+" "+resultSet.getString(5));
			RequestDispatcher dispatcher=request.getRequestDispatcher("home");
			dispatcher.forward(request, response);
			
			flag++;
		}
		
	}if(flag==0) {
		printWriter.print("Incorrect user id and password");
		RequestDispatcher dispatcher=request.getRequestDispatcher("/index.html");
		dispatcher.include(request, response);
		
		
		
	}

	    }catch (Exception e) {
			// TODO: handle exception
		}
		
		
			
	}

}
