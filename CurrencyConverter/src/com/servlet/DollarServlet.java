package com.servlet;


import java.io.IOException;

import java.io.PrintWriter;


import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;



@WebServlet(value="/DollarServlet")
public class DollarServlet extends HttpServlet {

	
protected void doGet(HttpServletRequest request, 
HttpServletResponse response) 
	throws ServletException, IOException {

	
	PrintWriter pw = response.getWriter();
	

	response.setContentType("text/html");
		
		
double amt = Double.parseDouble(
				
request.getParameter("amount")); 
		
		
double rate = 69.34;
		
	
	double ans = amt / rate;
		
		
pw.print("<h1>Your amount in dollars is "+ans+"</h1>");
	}

}















