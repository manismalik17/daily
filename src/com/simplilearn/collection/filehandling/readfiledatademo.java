package com.simplilearn.collection.filehandling;

import java.io.FileInputStream;

public class readfiledatademo {

	public static void main(String[] args) {
            
	readfile("data.txt");	
	System.out.println("----");
	System.out.println("list-db.txt");
	}
    private static void readfile(String filename) {
    	try {
    		FileInputStream input = new FileInputStream(filename);
            int count = 0;
            while((count =input.read())!=-1){
            	System.out.println((char)count);
            }
            input.close();
    	} catch (Exception e) {
			System.out.println("Exception occured"+e.getClass());
			System.out.println("Exception occured"+e.getMessage());
    	
    }
}
}
