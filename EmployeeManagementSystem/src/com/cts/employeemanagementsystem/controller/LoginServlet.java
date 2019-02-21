package com.cts.employeemanagementsystem.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userId= request.getParameter("userId");
		String password= request.getParameter("password");
		//System.out.println(userId);
		//System.out.println(password);
		if("admin".equals(userId) && "admin".equals(password)){
			//response.sendRedirect("admin.html");
			RequestDispatcher requestDispatcher= null;
			requestDispatcher= request.getRequestDispatcher("admin.html");
			//requestDispatcher.forward(request, response);
			requestDispatcher.include(request, response);
		}
		
		//doGet(request, response);
	}

}
