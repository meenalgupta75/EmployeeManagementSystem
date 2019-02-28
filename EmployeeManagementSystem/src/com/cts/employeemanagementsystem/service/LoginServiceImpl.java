package com.cts.employeemanagementsystem.service;

import com.cts.employeemanagementsystem.dao.LoginDAO;
import com.cts.employeemanagementsystem.dao.LoginDAOImpl;

public class LoginServiceImpl implements LoginService {
	
	private static LoginServiceImpl loginserviceImpl;
	private LoginDAO dao= LoginDAOImpl.getInstance();
	
	public static LoginServiceImpl getInstance()
	{
	if(loginserviceImpl==null)
		{
		loginserviceImpl= new LoginServiceImpl();
				return loginserviceImpl;
		}
	else{
		return loginserviceImpl;
		}
	}
	
	public int getUseStatus(String id){
		return dao.getUserStatus(id);
	}
	public String getUseType(String id){
		return dao.getUserType(id);
	}
	public boolean authenticate(String userName,String password){
		return dao.authenticate(userName, password);
	}

	public int getUserStatus(String id) {
		// TODO Auto-generated method stub
		return dao.getUserStatus(id);
	}

	public String getUserType(String id) {
		// TODO Auto-generated method stub
		return dao.getUserType(id);

	}
public String authorization(String userName){
		
		
		return getUserType(userName);
	
	}
}
