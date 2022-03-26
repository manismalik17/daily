package com.simplilearn.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmap {

	public static void main(String[] args) {
        
		Map<String, Double> grocery = new LinkedHashMap<String, Double>();
	    grocery.put("Orange", 341.8);
	    grocery.put("Apple", 343.8);
	    grocery.put("Ore0", 23.8);
	    grocery.put("brinjal", 323.8);
	    System.out.println(grocery);
	    System.out.println("apple:"+grocery.get("Apple"));
        System.out.println("-----");
        for(Map.Entry<String, Double> pushpa : grocery.entrySet() ) {
        	System.out.println("key::"+pushpa.getKey());
        	System.out.println("key::"+pushpa.getKey());
        	System.out.println("value::"+pushpa.getValue());
        	
        }
	    
	}

}
