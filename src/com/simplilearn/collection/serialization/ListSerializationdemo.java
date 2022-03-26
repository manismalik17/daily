package com.simplilearn.collection.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

public class ListSerializationdemo {

	public static void main(String[] args) {
		//step1 create an list object
		List<Account> list = new LinkedList<Account>();
		//add account into list
		list.add(new Account(1001, "Manish MAlik", 5010.1));
		list.add(new Account(1002, "Shivam Singh", 5020.2));
		list.add(new Account(1003, "Jatin Sarda", 5030.3));
		list.add(new Account(1004, "Aman Singh", 5004.4));
		try {
			//create file output stream
			FileOutputStream file = new FileOutputStream("list-db.txt");
			//create object stream
			ObjectOutputStream out = new ObjectOutputStream(file);
			//method to serialize object
			out.writeObject(list);
			System.out.println("serialization is completed");
			out.close();
			file.close();
		} catch (Exception e) {
			System.out.println("Exception occured"+e.getClass());
			System.out.println("Exception occured"+e.getMessage());
		}

	}

}
