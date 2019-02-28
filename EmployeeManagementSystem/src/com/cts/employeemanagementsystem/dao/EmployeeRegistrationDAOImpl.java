package com.cts.employeemanagementsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cts.employeemanagementsystem.util.DBUtils;

public class EmployeeRegistrationDAOImpl implements EmployeeRegistrationDAO {

	private static EmployeeRegistrationDAOImpl empregisDAOImpl;
	public static EmployeeRegistrationDAOImpl getInstance(){
		if(empregisDAOImpl==null){ 
			empregisDAOImpl = new EmployeeRegistrationDAOImpl();
			return empregisDAOImpl;
		}
		else{
			return empregisDAOImpl;
		}
		
	}
	private EmployeeRegistrationDAOImpl(){
		
	}
	public String insert(String id, String fn, String ln, int sal) {
		// TODO Auto-generated method stub
		String query ="INSERT INTO employee VALUES (?,?,?,?)";	
		Connection connection=null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet =null;
		connection = DBUtils.getConnection();
		try
		{
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,id);
			preparedStatement.setString(2,fn);
			preparedStatement.setString(3,ln);
			preparedStatement.setInt(4,sal);

			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next())
			{
				return "TUPPLE INSERTED";
			}
		}
		catch(SQLException e)
		{e.printStackTrace();}
		return null;}
	public String update(String empId, String change) {
		// TODO Auto-generated method stub
		 
			// TODO Auto-generated method stub
			String query ="UPDATE INTO employee SET salary=? Where empId=?";	
			Connection connection=null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet =null;
			connection = DBUtils.getConnection();
			try
			{
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1,change);
				preparedStatement.setString(2,empId);
				

				resultSet = preparedStatement.executeQuery();
				
				
					return "TUPPLE UPDATED";
				
			}
			catch(SQLException e)
			{e.printStackTrace();}
			return null;}	
	
	public String delete(String condition) {
		// TODO Auto-generated method stub
		return null;
	}	
	}

