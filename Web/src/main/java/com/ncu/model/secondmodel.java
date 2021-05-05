package com.ncu.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.ncu.validations.CourseCode;
import com.ncu.validations.Password;

public class secondmodel {
	@NotNull(message="is required")
	@Size(min=2,message="is required")
	private String fname;
	
	@CourseCode(value={"CSE","ECE"}, message="must start with CSE or ECE")
	private String lname;
	@Password
	 private String pin;
	 private String age;
	 private String add; 
	 private String gender;
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
