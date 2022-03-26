package com.simplilearn.collection.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class CreateNewfileDemo {

	public static void main(String[] args) {
	createfile("data.txt");	
	createfilefos("testdata.txt");
	}
//create file using file class
	private static void createfile(String filename) {
	//file
	File file = new File(filename);
	try {
		//create file
		boolean response =file.createNewFile();
		if(response) {
	        System.out.println("file is created successfully");
		}else {
			System.out.println("file already exist");
		}
		//write content to file ->filewriter->character stream
		FileWriter filew = new FileWriter(file);
		filew.write("today is a good day");
		filew.append("\ntoday is  wonderfull day ");
		filew.close();
		System.out.println("write operation is completed");
		
	} catch (Exception e) {
		System.out.println("Exception occured"+e.getClass());
		System.out.println("Exception occured"+e.getMessage());
		
	}
	
	}
	//create a file using fileouterstream class
	private static void createfilefos(String filename) {
		try {
             String data = "today is good day";
			FileOutputStream ile = new FileOutputStream(filename);
             ile.write(data.getBytes());
		} catch (Exception e) {
			System.out.println("Exception occured"+e.getClass());
			System.out.println("Exception occured"+e.getMessage());
		}
	}
	
}
