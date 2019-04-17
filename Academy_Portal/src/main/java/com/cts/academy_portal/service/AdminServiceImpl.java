package com.cts.academy_portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.academy_portal.bean.Batch;
import com.cts.academy_portal.bean.BatchAllocation;
import com.cts.academy_portal.bean.Faculty;
import com.cts.academy_portal.bean.FacultyCredit;
import com.cts.academy_portal.bean.Module;
import com.cts.academy_portal.bean.ReportManagement;
import com.cts.academy_portal.bean.SkillMaster;
import com.cts.academy_portal.dao.AdminDAO;
@Service("adminService")
@Transactional(propagation=Propagation.SUPPORTS)
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminDAO adminDAO;

	@Override
	public String insertModule(Module module) {
		// TODO Auto-generated method stub
		return adminDAO.insertModule(module);
	}

	@Override
	public String insertBatchAllocation(BatchAllocation batchAllocation) {
		// TODO Auto-generated method stub
		return adminDAO.insertBatchAllocation(batchAllocation);
	}

	@Override
	public String insertBatch(Batch batch) {
		// TODO Auto-generated method stub
		return adminDAO.insertBatch(batch);
	}

	@Override
	public List<Batch> getAllBatch() {
		// TODO Auto-generated method stub
		return adminDAO.getAllBatch();
	}

	@Override
	public List<Faculty> getAllFaculty() {
		// TODO Auto-generated method stub
		return adminDAO.getAllFaculty();
	}

	@Override
	public List<Module> getAllModule() {
		// TODO Auto-generated method stub
		return adminDAO.getAllModule();
	}

	@Override
	public ReportManagement getFeedback(String batchId) {
		// TODO Auto-generated method stub
		return adminDAO.getFeedback(batchId);
	}

	@Override
	public String insertFacultyCredit(FacultyCredit facultyCredit) {
		// TODO Auto-generated method stub
		return adminDAO.insertFacultyCredit(facultyCredit);
	}

	@Override
	public FacultyCredit getFacultyCredit(String batchId) {
		// TODO Auto-generated method stub
		return adminDAO.getFacultyCredit(batchId);
	}

	@Override
	public String insertSkill(SkillMaster skillMaster) {
		// TODO Auto-generated method stub
		return adminDAO.insertSkill(skillMaster);
	}

	@Override
	public List<BatchAllocation> getAllBatchAllocation() {
		// TODO Auto-generated method stub
		return adminDAO.getAllBatchAllocation();
	}

	@Override
	public String updateBatchAllocation(int id, String closeDate) {
		// TODO Auto-generated method stub
		
		return adminDAO.updateBatchAllocation(id, closeDate);
	}

	@Override
	public List<ReportManagement> getAllBatchFromReference() {
		// TODO Auto-generated method stub
		return adminDAO.getAllBatchFromReference();
	}

}
