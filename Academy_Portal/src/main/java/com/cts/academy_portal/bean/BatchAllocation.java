package com.cts.academy_portal.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="BatchAllocation")
@Table(name="Batch_Allocation_Table")
public class BatchAllocation {
	private int batchAllocationId;
	private String batchId;
	private String facultyId;
	private String moduleId;
	private String startDate;
	private String endDate;
	private String closeDate;
	
	public String getModuleId() {
		return moduleId;
	}
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getBatchAllocationId() {
		return batchAllocationId;
	}
	public void setBatchAllocationId(int batchAllocationId) {
		this.batchAllocationId = batchAllocationId;
	}
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
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return "BatchAllocation [batchAllocationId=" + batchAllocationId + ", batchId=" + batchId + ", facultyId="
				+ facultyId + ", moduleId=" + moduleId + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", closeDate=" + closeDate + "]";
	}
	
}
