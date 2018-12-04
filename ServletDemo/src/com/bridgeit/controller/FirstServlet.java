package com.bridgeit.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet extends GenericServlet{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	String name=	request.getParameter("nm");
	String password=request.getParameter("password");
	PrintWriter printWriter=response.getWriter();
	System.out.println("sss");
	printWriter.print("<html><body >"+"<h1>welcome"+"   "+name+ "    "+password+"</h1>"+"</body></html>");
	printWriter.flush();
	printWriter.close();
	}

}
