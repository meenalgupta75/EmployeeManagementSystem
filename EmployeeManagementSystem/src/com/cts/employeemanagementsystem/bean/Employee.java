package com.cts.employeemanagementsystem.bean;
public class Employee {

	private String empID;
	private static Employee employee;
	public static Employee getInstance(){
		if(employee==null){
			employee=new Employee();
			return employee;
		}
		else
			return employee;
	}
	public Employee(){
		
	}
	public Employee(String empID, String firstName, String lastName, float salary) {
		super();
		this.empID = empID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	private String firstName;
	private String lastName;
	float salary;
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
}
