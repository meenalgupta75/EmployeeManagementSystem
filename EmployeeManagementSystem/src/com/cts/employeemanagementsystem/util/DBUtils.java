package com.cts.employeemanagementsystem.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	
	public final static String userName="system";
	public final static String password="11";
	public final static String url="jdbc:oracle:thin:@localhost:1521:XE";
	public final static String driverName="oracle.jdbc.driver.OracleDriver";
	
	public static Connection getConnection(){
		Connection connection=null;
		try{
		
		Class.forName(driverName);
		connection= DriverManager.getConnection(url,userName,password);
		return connection;
		
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return null;
	}
	public static void closeConnection(Connection connection){
	try{
		connection.close();
	}
	catch(SQLException e){
		e.printStackTrace();
	}

	}
}