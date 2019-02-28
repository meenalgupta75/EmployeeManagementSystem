package com.cts.employeemanagementsystem.service;

public interface LoginService {
	
	public int getUserStatus(String id);
	public String getUserType(String id);
	boolean authenticate(String userId, String password);
	public String authorization(String userName);

}
