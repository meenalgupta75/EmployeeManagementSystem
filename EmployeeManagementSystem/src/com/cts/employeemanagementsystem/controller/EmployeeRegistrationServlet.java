package com.cts.employeemanagementsystem.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.employeemanagementsystem.service.EmployeeService;
import com.cts.employeemanagementsystem.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeRegistrationServlet
 */
public class EmployeeRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeRegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String empId=request.getParameter("empID");
		String firstName= request.getParameter("firstName");
		String lastName= request.getParameter("lastName");
		int salary=Integer.parseInt(request.getParameter("salary"));
		System.out.println(empId);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(salary);
		//doGet(request, response);
		EmployeeService empService=EmployeeServiceImpl.getInstance();
		empService.insert(empId,firstName,lastName,salary);
	}

}
