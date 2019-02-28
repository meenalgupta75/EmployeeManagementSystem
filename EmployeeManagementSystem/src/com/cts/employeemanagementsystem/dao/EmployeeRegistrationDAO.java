package com.cts.employeemanagementsystem.dao;

public interface EmployeeRegistrationDAO {

	public String insert(String id, String fn, String ln, int sal);
	public String update(String tuple,String change);
	public String delete(String condition);
}
