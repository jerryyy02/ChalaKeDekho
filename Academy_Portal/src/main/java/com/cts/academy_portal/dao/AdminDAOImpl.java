package com.cts.academy_portal.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.academy_portal.bean.Batch;
import com.cts.academy_portal.bean.BatchAllocation;
import com.cts.academy_portal.bean.Faculty;
import com.cts.academy_portal.bean.FacultyCredit;
import com.cts.academy_portal.bean.Module;
import com.cts.academy_portal.bean.ReportManagement;
import com.cts.academy_portal.bean.SkillMaster;
@Repository("adminDAO")
public class AdminDAOImpl implements AdminDAO {
	
	@Autowired
	@Qualifier("sessionFactory")
	SessionFactory getSessionFactory;

	@Transactional
	public String insertModule(Module module) {
		// TODO Auto-generated method stub
		Session session = null;
		try {
			session = getSessionFactory.getCurrentSession();
			session.save(module);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(module==null){
			return "fail";
		}
		else{
			return "user added";
		}
	}

	@Transactional
	public String insertBatchAllocation(BatchAllocation batchAllocation) {
		// TODO Auto-generated method stub
		Session session = null;
		try {
			session = getSessionFactory.getCurrentSession();
			session.save(batchAllocation);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(batchAllocation==null){
			return "fail";
		}
		else{
			return "user added";
		}
	}

	@Transactional
	public String insertBatch(Batch batch) {
		// TODO Auto-generated method stub
		Session session = null;
		try {
			session = getSessionFactory.getCurrentSession();
			session.save(batch);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(batch==null){
			return "fail";
		}
		else{
			return "Batch Added";
		}
	}

	@Transactional(readOnly=true)
	public List<Batch> getAllBatch() {
		// TODO Auto-generated method stub
		Session session = null;
		String query= "from Batch ";
	org.hibernate.query.Query<Batch> query2=null;
	
		//try {
			session = getSessionFactory.getCurrentSession();
			query2=session.createQuery(query);
			List<Batch> list = query2.getResultList();
			System.out.println("Hello");
			return list;
	}
	
	@Transactional(readOnly=true)
	public List<ReportManagement> getAllBatchFromReference() {
		// TODO Auto-generated method stub
		Session session = null;
		String query= "from ReportManagement ";
	org.hibernate.query.Query<ReportManagement> query2=null;
	
		//try {
			session = getSessionFactory.getCurrentSession();
			query2=session.createQuery(query);
			List<ReportManagement> list = query2.getResultList();
			System.out.println("Hello from report management");
			return list;
	}

	@Transactional(readOnly=true)
	public List<Faculty> getAllFaculty() {
		// TODO Auto-generated method stub
		Session session = null;
		String query= "from Faculty ";
	org.hibernate.query.Query<Faculty> query2=null;
	
		//try {
			session = getSessionFactory.getCurrentSession();
			query2=session.createQuery(query);
			List<Faculty> list = query2.getResultList();
			System.out.println("Hello");
			return list;
	}

	@Transactional(readOnly=true)
	public List<Module> getAllModule() {
		// TODO Auto-generated method stub
		Session session = null;
		String query= "from Module ";
	org.hibernate.query.Query<Module> query2=null;
	
		//try {
			session = getSessionFactory.getCurrentSession();
			query2=session.createQuery(query);
			List<Module> list = query2.getResultList();
			System.out.println("Hello");
			return list;
	}

	@Transactional(readOnly=true)
	public ReportManagement getFeedback(String batchId) {
		// TODO Auto-generated method stub
		Session session = null;
		String query= "from ReportManagement where batchId = ?";
	org.hibernate.query.Query<ReportManagement> query2=null;
		try {
			session = getSessionFactory.getCurrentSession();
			query2=session.createQuery(query);
			query2.setParameter(0, batchId);
			ReportManagement reportManagement = new ReportManagement();
			reportManagement = query2.getSingleResult();
			return reportManagement;
		} catch (Exception e) {
			e.printStackTrace();
		}
return null;
	}

	@Transactional
	public String insertFacultyCredit(FacultyCredit facultyCredit) {
		// TODO Auto-generated method stub
		Session session = null;
		try {
			session = getSessionFactory.getCurrentSession();
			session.saveOrUpdate(facultyCredit);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(facultyCredit==null){
			return "fail";
		}
		else{
			return "Faculty Credit Added";
		}
	}

	@Transactional(readOnly=true)
	public FacultyCredit getFacultyCredit(String batchId) {
		// TODO Auto-generated method stub
		Session session = null;
		String query= "from FacultyCredit where batchId = ?";
	org.hibernate.query.Query<FacultyCredit> query2=null;
		try {
			session = getSessionFactory.getCurrentSession();
			query2=session.createQuery(query);
			query2.setParameter(0, batchId);
			FacultyCredit facultyCredit = new FacultyCredit();
			facultyCredit = query2.getSingleResult();
			return facultyCredit;
		} catch (Exception e) {
			e.printStackTrace();
		}
return null;
	}

	@Transactional
	public String insertSkill(SkillMaster skillMaster) {
		// TODO Auto-generated method stub
		Session session = null;
		try {
			session = getSessionFactory.getCurrentSession();
			session.save(skillMaster);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(skillMaster==null){
			return "fail";
		}
		else{
			return "Batch Added";
		}
	}

	@Transactional(readOnly=true)
	public List<BatchAllocation> getAllBatchAllocation() {
		// TODO Auto-generated method stub
		Session session = null;
		String query= "from BatchAllocation ";
	org.hibernate.query.Query<BatchAllocation> query2=null;
	
		//try {
			session = getSessionFactory.getCurrentSession();
			query2=session.createQuery(query);
			List<BatchAllocation> list = query2.getResultList();
			System.out.println("Hello");
			return list;
	}

	@Transactional
	public String updateBatchAllocation(int id, String closeDate) {
		// TODO Auto-generated method stub
		Session session = null;
		System.out.println("id= "+ id + "CloseDate = " + closeDate);
		String query= "from BatchAllocation where batchAllocationId = ?";
	org.hibernate.query.Query<BatchAllocation> query2=null;
	
		//try {
			session = getSessionFactory.getCurrentSession();
			query2=session.createQuery(query);
			query2.setParameter(0, id);
			System.out.println("hiiii");
			BatchAllocation batchAllocation = query2.getSingleResult();
			System.out.println(batchAllocation);
			batchAllocation.setCloseDate(closeDate);
			session.saveOrUpdate(batchAllocation);
			return "done";
		
	}

	

}
