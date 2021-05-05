package com.ncu.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;




public class firstmodel {
	
	private String fname;
	

	private String lname;
	
	 private String pin;
	 private String age;
	 private String add; 
	 private String gender;
	 @NotNull(message="is required")
	@Size(min=2,message="is required")
	 private String eid;
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
