package com.cts.academy_portal.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Faculty_Credit_Table")
public class FacultyCredit {
	
	private String batchId;
	private String facultyId;
	private int weeklyReport;
	private int bhsReport;
	private int mockTest;
	private int innovationProject;
	private int total;
	
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
	public int getBhsReport() {
		return bhsReport;
	}
	public void setBhsReport(int bhsReport) {
		this.bhsReport = bhsReport;
	}
	public int getMockTest() {
		return mockTest;
	}
	public void setMockTest(int mockTest) {
		this.mockTest = mockTest;
	}
	public int getInnovationProject() {
		return innovationProject;
	}
	public void setInnovationProject(int innovationProject) {
		this.innovationProject = innovationProject;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return "FacultyCredit [batchId=" + batchId + ", facultyId=" + facultyId + ", weeklyReport=" + weeklyReport
				+ ", bhsReport=" + bhsReport + ", mockTest=" + mockTest + ", innovationProject=" + innovationProject
				+ ", total=" + total + "]";
	}
	public FacultyCredit(String batchId, String facultyId, int weeklyReport, int bhsReport, int mockTest,
			int innovationProject, int total) {
		super();
		this.batchId = batchId;
		this.facultyId = facultyId;
		this.weeklyReport = weeklyReport;
		this.bhsReport = bhsReport;
		this.mockTest = mockTest;
		this.innovationProject = innovationProject;
		this.total = total;
	}
	public FacultyCredit() {
		super();
	}
	
}
