package com.cts.academy_portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.academy_portal.bean.Faculty;
import com.cts.academy_portal.bean.ReportManagement;
import com.cts.academy_portal.bean.SkillSet;
import com.cts.academy_portal.dao.FacultyDAO;


@Service("facultyService")
@Transactional(propagation=Propagation.SUPPORTS)
public class FacultyServiceImpl implements FacultyService {
	
	@Autowired
	private FacultyDAO facultyDAO;

	@Override
	public String insertFaculty(Faculty faculty) {
		// TODO Auto-generated method stub
		return facultyDAO.insertFaculty(faculty);
	}

	@Override
	public String insertReport(ReportManagement reportManagement) {
		// TODO Auto-generated method stub
		return facultyDAO.insertReport(reportManagement);
	}

	@Override
	public String insertSkill(SkillSet skillSet) {
		// TODO Auto-generated method stub
		return facultyDAO.insertSkill(skillSet);
	}

}
