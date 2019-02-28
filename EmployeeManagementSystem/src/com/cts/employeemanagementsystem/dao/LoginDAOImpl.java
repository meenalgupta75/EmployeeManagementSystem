package com.cts.employeemanagementsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cts.employeemanagementsystem.util.DBUtils;

public class LoginDAOImpl implements LoginDAO {
	
	
		private static LoginDAOImpl loginDAOImpl;
		public static LoginDAOImpl getInstance(){
			if(loginDAOImpl==null){ 
				loginDAOImpl = new LoginDAOImpl();
				return loginDAOImpl;
			}
			else{
				return loginDAOImpl;
			}
			
		}
	

	public int getUserStatus(String id){
		String query="select status from login_table where userid=?";
		Connection connection= null;
		PreparedStatement preparedStatement= null;
		ResultSet resultSet=null;
		connection = DBUtils.getConnection();
		try{
			System.out.println(id);
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1, id);
			resultSet=preparedStatement.executeQuery();
			if(resultSet.next())
			{
				System.out.println("from dao"+resultSet.getInt("status"));
				return resultSet.getInt("status");
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return 0;
	}
	public String getUserType(String id){
		String query="select usertype from login_table where userid=?";
		Connection connection= null;
		PreparedStatement preparedStatement= null;
		ResultSet resultSet=null;
		connection = DBUtils.getConnection();
		try{
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1, id);
			resultSet=preparedStatement.executeQuery();
			if(resultSet.next())
			{
				return resultSet.getString("usertype");
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}
	public boolean authenticate(String userName, String password) {
		// TODO Auto-generated method stub
		String query="select * from login_table where userid=? and password=?";
		Connection connection= null;
		PreparedStatement preparedStatement= null;
		ResultSet resultSet=null;
		connection = DBUtils.getConnection();
		try{
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1, userName);
			preparedStatement.setString(2, password);
			resultSet=preparedStatement.executeQuery();
			if(resultSet.next())
			{
				return true;
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	
		return false;
	}
	public String authorization(String userName){
		
		
		return getUserType(userName);
	
	}
	
}

	
