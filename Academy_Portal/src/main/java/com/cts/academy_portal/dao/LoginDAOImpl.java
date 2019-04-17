package com.cts.academy_portal.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.academy_portal.bean.Login;

@Repository("loginDAO")
public class LoginDAOImpl implements LoginDAO {
	@Autowired
	@Qualifier("sessionFactory")
	SessionFactory getSessionFactory;

	@Override
	public int getUserStatus(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getUserType(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional(readOnly=true)
	public Login authenticate(String userName, String password) {
		// TODO Auto-generated method stub
		Session session = null;
		String query= "from Login where userName = ? AND password = ?";
	org.hibernate.query.Query<Login> query2=null;
	
		try {
			session = getSessionFactory.getCurrentSession();
			query2=session.createQuery(query);
			query2.setParameter(0, userName);
			query2.setParameter(1, password);
			Login login = new Login();
			login = query2.getSingleResult();
			if(login==null)
				return null;
			else
			return login;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Transactional
	public String insertUser(Login login) {
		// TODO Auto-generated method stub
			Session session = null;
			try {
				session = getSessionFactory.getCurrentSession();
				session.save(login);
				login.setUserStatus(0);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(login==null){
				return "fail";
			}
			else{
				return "user added";
			}

		}

	@Transactional
	public String sessionStarted(String userName) {
		// TODO Auto-generated method stub
		Session session = null;
		String query= "update Login set userStatus = 1 where id = ?";
	org.hibernate.query.Query<Login> query2=null;
	
		try {
			session = getSessionFactory.getCurrentSession();
			query2=session.createQuery(query);
			query2.setParameter(0, userName);
			int execute = query2.executeUpdate();
			if(execute==0)
				return "fail";
			else
			return "Pass";
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Transactional
	public String sessionClosed(String userName) {
		// TODO Auto-generated method stub
		Session session = null;
		String query= "update Login set userStatus = 0 where id = ?";
	org.hibernate.query.Query<Login> query2=null;
	
		try {
			session = getSessionFactory.getCurrentSession();
			query2=session.createQuery(query);
			query2.setParameter(0, userName);
			int execute = query2.executeUpdate();
			if(execute==0)
				return "fail";
			else
			return "Pass";
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	}

