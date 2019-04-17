package com.cts.academy_portal.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Batch_Table")
public class Batch {
	
	private String batchId;
	private String batchName;
	private String batchDetails;
	
	@Id
	@Column(name="batchId")
	public String getBatchId() {
		return batchId;
	}
	
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public String getBatchDetails() {
		return batchDetails;
	}
	public void setBatchDetails(String batchDetails) {
		this.batchDetails = batchDetails;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return "Batch [batchId=" + batchId + ", batchName=" + batchName + ", batchDetails=" + batchDetails + "]";
	}
	
}
