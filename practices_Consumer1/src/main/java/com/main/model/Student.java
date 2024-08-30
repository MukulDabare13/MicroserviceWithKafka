package com.main.model;

import java.io.Serializable;

public class Student implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String rollno;
	private String name;
	private String username;
	private String password;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	
	
	

}
