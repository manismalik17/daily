package com.simplilearn.collection.filehandling;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class readfileintolist {

	public static void main(String[] args) {
       List<String> line = readfile("data.txt","C:\\Users\\manis\\.eclipse\\phase1\\");
		//print data on console by read line by line text
       for(String lines : line) {
    	   System.out.println(lines);
       }
		
	}
      private static List<String> readfile(String filename,String path){
    	  List<String> line = Collections.emptyList();
    	  try {
			line = Files.readAllLines(Paths.get(path+filename),StandardCharsets.UTF_8);
		} catch (Exception e) {
			System.out.println("Exception occured"+e.getClass());
			System.out.println("Exception occured"+e.getMessage());
		}
    	  
    	return line;  
      }
}
