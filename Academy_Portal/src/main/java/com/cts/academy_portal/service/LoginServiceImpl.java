package com.cts.academy_portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.academy_portal.bean.Login;
import com.cts.academy_portal.dao.LoginDAO;
@Service("loginService")
@Transactional(propagation=Propagation.SUPPORTS)
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDAO loginDAO;

	@Override
	public int getUserStatus(String id) {
		// TODO Auto-generated method stub
		return loginDAO.getUserStatus(id);
	}

	@Override
	public String getUserType(String id) {
		// TODO Auto-generated method stub
		return loginDAO.getUserType(id);
	}

	@Override
	public Login authenticate(String userName, String password) {
		// TODO Auto-generated method stub
		return loginDAO.authenticate(userName, password);
	}

	@Override
	public String insertUser(Login login) {
		// TODO Auto-generated method stub
		return loginDAO.insertUser(login);
	}

	@Override
	public String sessionStarted(String userName) {
		// TODO Auto-generated method stub
		return loginDAO.sessionStarted(userName);
	}

	@Override
	public String sessionClosed(String userName) {
		// TODO Auto-generated method stub
		return loginDAO.sessionClosed(userName);
	}

}
