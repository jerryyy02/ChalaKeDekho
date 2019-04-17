package com.cts.academy_portal.dao;

import com.cts.academy_portal.bean.Login;

public interface LoginDAO {
	
	public int getUserStatus(String id); 
	public String getUserType(String id);
	public Login authenticate(String userName, String password);
	public String insertUser(Login login);
	public String sessionStarted(String userName);
	public String sessionClosed(String userName);

}
