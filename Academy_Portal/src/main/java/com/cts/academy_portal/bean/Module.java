package com.cts.academy_portal.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Module_Table")
public class Module {
		
		private String moduleId;
		private String moduleName;
		private String ModuleDesc;
		
		
		@Id
		@Column(name="moduleId")
		public String getModuleId() {
			return moduleId;
		}
		public void setModuleId(String moduleId) {
			this.moduleId = moduleId;
		}
		public String getModuleName() {
			return moduleName;
		}
		public void setModuleName(String moduleName) {
			this.moduleName = moduleName;
		}
		public String getModuleDesc() {
			return ModuleDesc;
		}
		public void setModuleDesc(String moduleDesc) {
			ModuleDesc = moduleDesc;
		}
		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return super.equals(obj);
		}
		@Override
		public String toString() {
			return "Module [moduleId=" + moduleId + ", moduleName=" + moduleName + ", ModuleDesc=" + ModuleDesc + "]";
		}
		
}
