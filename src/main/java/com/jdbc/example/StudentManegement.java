package com.jdbc.example;

public class StudentManegement {
	
	String name;
	String password;
	String email;
	String address;
	
	public StudentManegement() {
		
	}
	public StudentManegement(String name, String password, String email, String address) {
		this.name = name;
		this.password = password;
		this.email = email;
		this.address = address;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "StudentManegement [name=" + name + ", password=" + password + ", email=" + email + ", address="
				+ address + "]";
	}
	

}
