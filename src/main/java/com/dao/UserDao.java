package com.dao;

public class UserDao {
	String name; 
	
	public UserDao() {
		System.out.println("UserDao()");
	}

	public void init() {
		System.out.println("init()");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
