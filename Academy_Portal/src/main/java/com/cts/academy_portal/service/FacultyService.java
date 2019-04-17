package com.cts.academy_portal.service;

import com.cts.academy_portal.bean.Faculty;
import com.cts.academy_portal.bean.ReportManagement;
import com.cts.academy_portal.bean.SkillSet;

public interface FacultyService {
	
	public String insertFaculty(Faculty faculty);
	public String insertReport(ReportManagement reportManagement);
	public String insertSkill(SkillSet skillSet);

}
