package com.cts.employeemanagementsystem.service;

public interface EmployeeService {
	public String insert(String id, String fn, String ln, int sal);
	public String update(String tuple,String change);
}
