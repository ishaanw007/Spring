package com.ncu.model;

public class firstmodel {
 
private String name;
 private String password;
 private String age;
 private String cart[];
 public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
private String gender;
 

public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}

 
 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String[] getCart() {
		return cart;
	}
	public void setCart(String cart[]) {
		this.cart = cart;
	}
}
