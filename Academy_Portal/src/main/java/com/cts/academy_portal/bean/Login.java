package com.cts.academy_portal.bean;

import java.io.InputStream;
import java.sql.Blob;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="Login_Table")
public class Login {
	
	private String userName;
	private String password;
	private String userType;
	private int	userStatus;
	private String fName;
	private String lName;
	
	@Id
	@Column(name="userName")
	public String getUserName() {
		return userName;
	}
	
	
	public Login(String userName, String password, String userType, int userStatus, String fName, String lName) {
	super();
	this.userName = userName;
	this.password = password;
	this.userType = userType;
	this.userStatus = userStatus;
	this.fName = fName;
	this.lName = lName;
	}


	@Override
	public String toString() {
		return "Login [userName=" + userName + ", password=" + password + ", userType=" + userType + ", userStatus="
				+ userStatus + ", fName=" + fName + ", lName=" + lName + "]";
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public int getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}

	public Login()
	{}

}
