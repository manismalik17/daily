package com.simplilearn.collection.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializationdemo {

	public static void main(String[] args) {
		Account employee = new Account(1001, "Manish MAlik", 5000.3);
		try {
			//create file output stream
			FileOutputStream file = new FileOutputStream("files-db.txt");
			//create object stream
			ObjectOutputStream out = new ObjectOutputStream(file);
			//method to serialize object
			out.writeObject(employee);
			System.out.println("serialization is completed");
			out.close();
			file.close();
		} catch (Exception e) {
			System.out.println("Exception occured"+e.getClass());
			System.out.println("Exception occured"+e.getMessage());
		}

	}

}
