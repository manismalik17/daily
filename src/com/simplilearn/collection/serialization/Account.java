package com.simplilearn.collection.serialization;

import java.io.Serializable;

public class Account implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	public int id;
	public String name;
	public double balance;
	
	public Account(int id, String name, double balance) {
		
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balane=" + balance + "]";
	}
	
	}
	
		
	
	
	


	

