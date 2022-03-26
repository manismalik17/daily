package com.simplilearn.collection.map.account;

public class Account {
	
	public int id;
	public String name;
	public double balane;
	public Account(int id, String name, double balane) {
		
		this.id = id;
		this.name = name;
		this.balane = balane;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balane=" + balane + "]";
	}
	
	}
	
		
	
	
	


	

