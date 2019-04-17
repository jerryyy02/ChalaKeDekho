package com.cts.academy_portal.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Report_Management_Table")
public class ReportManagement {
	
	private String batchId;
	private String facultyId;
	private int weeklyReport;
	private String bhsReport;
	private int mockTest;
	private String innovationProject;
	
	
	@Id
	@Column(name="batchId")
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public String getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(String facultyId) {
		this.facultyId = facultyId;
	}
	public int getWeeklyReport() {
		return weeklyReport;
	}
	public void setWeeklyReport(int weeklyReport) {
		this.weeklyReport = weeklyReport;
	}
	public String getBhsReport() {
		return bhsReport;
	}
	public void setBhsReport(String bhsReport) {
		this.bhsReport = bhsReport;
	}
	public int getMockTest() {
		return mockTest;
	}
	public void setMockTest(int mockTest) {
		this.mockTest = mockTest;
	}
	public String getInnovationProject() {
		return innovationProject;
	}
	public void setInnovationProject(String innovationProject) {
		this.innovationProject = innovationProject;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return "ReportManagement [batchId=" + batchId + ", facultyId=" + facultyId + ", weeklyReport=" + weeklyReport
				+ ", bhsReport=" + bhsReport + ", mockTest=" + mockTest + ", innovationProject=" + innovationProject
				+ "]";
	}
	
}
