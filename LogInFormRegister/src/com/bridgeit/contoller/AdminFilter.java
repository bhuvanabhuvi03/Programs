package com.bridgeit.contoller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AdminFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		PrintWriter printWriter=response.getWriter();
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		try {
	        Class.forName("com.mysql.jdbc.Driver");
	       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			
	        PreparedStatement ps = con
	                .prepareStatement("select * from servlet");
	        //System.out.println(ps);
	        ResultSet resultSet=ps.executeQuery();
	        System.out.println("ss");
	        
	        while(resultSet.next()) {
	        	
	        	if(resultSet.getString(4).equals(email)&&resultSet.getString(5).equals(password)&&resultSet.getString(6).equals("admin")) {
	        		printWriter.println("wellcome admin"+resultSet.getString(2)+" "+resultSet.getString(3));
	        		}
	        	else {
	        		System.out.println("sss");
	        		chain.doFilter(request, response);
	        	}
	        
	        	
	        }
	        
	        
	        
	        
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
