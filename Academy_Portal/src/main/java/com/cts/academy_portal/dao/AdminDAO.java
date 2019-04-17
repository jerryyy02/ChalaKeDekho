package com.cts.academy_portal.dao;

import java.util.List;

import com.cts.academy_portal.bean.Batch;
import com.cts.academy_portal.bean.BatchAllocation;
import com.cts.academy_portal.bean.Faculty;
import com.cts.academy_portal.bean.FacultyCredit;
import com.cts.academy_portal.bean.Module;
import com.cts.academy_portal.bean.ReportManagement;
import com.cts.academy_portal.bean.SkillMaster;

public interface AdminDAO {
	
	public String insertModule(Module module);
	public String insertBatchAllocation(BatchAllocation batchAllocation);
	public String insertBatch(Batch batch);
	public List<Batch> getAllBatch();
	public List<Faculty> getAllFaculty();
	public List<Module> getAllModule();
	public ReportManagement getFeedback(String batchId);
	public String insertFacultyCredit(FacultyCredit facultyCredit);
	public FacultyCredit getFacultyCredit(String batchId);
	public String insertSkill(SkillMaster skillMaster);
	public List<BatchAllocation> getAllBatchAllocation();
	public String updateBatchAllocation(int id, String closeDate);
	public List<ReportManagement> getAllBatchFromReference();


}
