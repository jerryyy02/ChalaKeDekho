package com.cts.academy_portal.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Skill_Master")
public class SkillMaster {
	
	@Id
	@Column(name="skillId")
	private String skillId;
	private String skill;
	private String certification;
	
	@Id
	@Column(name="skillId")
	public String getSkillId() {
		return skillId;
	}
	public void setSkillId(String skillId) {
		this.skillId = skillId;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getCertification() {
		return certification;
	}
	public void setCertification(String certification) {
		this.certification = certification;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return "SkillMaster [skillId=" + skillId + ", skill=" + skill + ", certification=" + certification + "]";
	}

}
