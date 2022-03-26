package com.simplilearn.collection.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class listdeserializationdemo {

	public static void main(String[] args) {
		
		//reading byte stream
		try {
			//read a file
			FileInputStream file = new FileInputStream("list-db.txt");
			//create a input stream object
			ObjectInputStream input = new ObjectInputStream(file);
			//method to deserialaize a object
			List<Account> accountlist = (List<Account>) input.readObject();
			System.out.println("deserialization completed");
			for(Account employee : accountlist) {
				System.out.println("emp Id:"+employee.id);
				System.out.println("emp name:"+employee.name);
				System.out.println("emp balance:"+employee.balance);
			}
			
			
		} catch (Exception e) {
			System.out.println("Exception occured"+e.getClass());
			System.out.println("Exception occured"+e.getMessage());

		}
	}

}
