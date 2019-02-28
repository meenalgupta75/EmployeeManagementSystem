package com.cts.employeemanagementsystem.service;

import com.cts.employeemanagementsystem.dao.EmployeeRegistrationDAOImpl;

import com.cts.employeemanagementsystem.dao.EmployeeRegistrationDAO;

public class EmployeeServiceImpl implements EmployeeService{
		private static EmployeeServiceImpl emp_serviceImpl;	
		private EmployeeRegistrationDAO e_dao = EmployeeRegistrationDAOImpl.getInstance();

		public static EmployeeServiceImpl getInstance()
		{
			if(emp_serviceImpl==null)
			{
				emp_serviceImpl = new EmployeeServiceImpl();
				return emp_serviceImpl;
			}
			else
			{
				return emp_serviceImpl;
			}
		}
		public String insert(String id, String fn, String ln, int sal) {
			return e_dao.insert(id,fn,ln,sal);
		}
		public String update(String tuple, String change) {
			// TODO Auto-generated method stub
			return e_dao.update(tuple,change);
		}
		
		
		
	}
	
	

