package com.cts.employeemanagementsystem.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cts.employeemanagementsystem.service.LoginService;
import com.cts.employeemanagementsystem.service.LoginServiceImpl;

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
		/*//System.out.println(userId);
		//System.out.println(password);
		if("admin".equals(userId) && "admin".equals(password)){
			//response.sendRedirect("admin.html");
			RequestDispatcher requestDispatcher= null;
			requestDispatcher= request.getRequestDispatcher("admin.html");
			//requestDispatcher.forward(request, response);
			requestDispatcher.include(request, response);
		}
		
		//doGet(request, response);*/
		LoginService loginService= LoginServiceImpl.getInstance();
		RequestDispatcher rd=null;
		if(loginService.authenticate(userId,password))
		{
			//System.out.println("inside if authenticate");
			int userStatus= loginService.getUserStatus(userId);
			String authorization=loginService.authorization(userId);
			System.out.println(userStatus);
			if(userStatus==1){
				HttpSession session=request.getSession();
				session.setAttribute("userName", userId);
				 rd=request.getRequestDispatcher("ali.jsp");
				rd.forward(request, response);
			}
			else if(userStatus==2) {
				System.out.println("hello");
				 rd=request.getRequestDispatcher("deactivateUser.jsp");
				rd.forward(request, response);
			}
			else if(userStatus==0) {
			if("A".equals(authorization))
			{
					HttpSession session=request.getSession();
					session.setAttribute("userName", userId);
					 rd=request.getRequestDispatcher("admin.jsp");
					rd.forward(request, response);
				
			}
			
			if("U".equals(authorization))
			{
				HttpSession session=request.getSession();
				session.setAttribute("userName", userId);
					 rd=request.getRequestDispatcher("user.jsp");
					rd.forward(request, response);
			}
			
			
			if("V".equals(authorization))
			{
				HttpSession session=request.getSession();
				session.setAttribute("userName", userId);
					 rd=request.getRequestDispatcher("vendorHome.jsp");
					rd.forward(request, response);
				
			}
			
		}
			}
		else{
			//redirect to login page
			 rd=request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
	}

}
