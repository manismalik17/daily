package com.simplilearn.collection.filehandling;

import java.nio.file.Files;
import java.nio.file.Paths;

public class deletefiledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     deletefile("data.txt","C:\\Users\\manis\\.eclipse\\phase1\\");
	}
    private static void deletefile(String filename, String path) {
	   //delete file
    	try {
			Files.delete(Paths.get(path+filename));
			System.out.println("file is deleted");
		} catch (Exception e) {
			System.out.println("file not found exception !");
			System.out.println("Exception occured"+e.getClass());
			System.out.println("Exception occured"+e.getMessage());
		}
}

}
