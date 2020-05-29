package com.servlet;


import java.io.IOException;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;


@WebServlet(value="/GetAmount")

public class Input extends HttpServlet {

	
protected void doPost(HttpServletRequest request,
HttpServletResponse response) 
	throws ServletException, IOException {
		
	
	double amt = Double.parseDouble(
			
	request.getParameter("txtAmt"));
		
		
String choice = request.getParameter("radCurrency");
		
		
String location = "";
		
		
switch(choice)
		{
			
case "d" : location = "DollarServlet?amount="+amt;
							
  break;
		
			
case "p" : location = "PoundServlet?amount="+amt;
							  
 break;				  
		}
		
		
response.sendRedirect(location);
	}

}







