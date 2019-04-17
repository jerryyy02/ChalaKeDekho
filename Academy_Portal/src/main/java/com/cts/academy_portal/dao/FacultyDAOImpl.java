package com.cts.academy_portal.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.academy_portal.bean.Faculty;
import com.cts.academy_portal.bean.ReportManagement;
import com.cts.academy_portal.bean.SkillSet;



@Repository("facultyDAO")
public class FacultyDAOImpl implements FacultyDAO {
	
	@Autowired
	@Qualifier("sessionFactory")
	SessionFactory getSessionFactory;

	@Transactional
	public String insertFaculty(Faculty faculty) {
		// TODO Auto-generated method stub
		Session session = null;
		try {
			session = getSessionFactory.getCurrentSession();
			session.save(faculty);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(faculty==null){
			return "fail";
		}
		else{
			return "user added";
		}

	}

	@Transactional
	public String insertReport(ReportManagement reportManagement) {
		// TODO Auto-generated method stub
		Session session = null;
		try {
			session = getSessionFactory.getCurrentSession();
			session.save(reportManagement);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(reportManagement==null){
			return "fail";
		}
		else{
			return "user added";
		}
	}

	@Transactional
	public String insertSkill(SkillSet skillSet) {
		// TODO Auto-generated method stub
		Session session = null;
		try {
			session = getSessionFactory.getCurrentSession();
			session.save(skillSet);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(skillSet==null){
			return "fail";
		}
		else{
			return "user added";
		}
	}
		
	
}
