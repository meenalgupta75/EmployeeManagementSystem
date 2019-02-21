package com.cts.employeemanagementsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cts.employeemanagementsystem.util.DBUtils;

public class LoginDAOImpl implements LoginDAO {

	public int getUserStatus(String id){
		String query="select userstatus from login where userid=?";
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
				return resultSet.getInt("status");
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return 0;
	}
	public String getUserType(String id){
		String query="select usertype from login where userid=?";
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
		String query="select * from login where username=? and password=?";
		Connection connection= null;
		PreparedStatement preparedStatement= null;
		ResultSet resultSet=null;
		connection = DBUtils.getConnection();
		try{
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1, userName);
			preparedStatement.setString(1, userName);
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
	
}
