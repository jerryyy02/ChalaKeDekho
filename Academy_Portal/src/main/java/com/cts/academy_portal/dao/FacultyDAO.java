package com.cts.academy_portal.dao;

import com.cts.academy_portal.bean.Faculty;
import com.cts.academy_portal.bean.ReportManagement;
import com.cts.academy_portal.bean.SkillSet;

public interface FacultyDAO {
	
	public String insertFaculty(Faculty faculty);
	public String insertReport(ReportManagement reportManagement);
	public String insertSkill(SkillSet skillSet);
}
