package com.simplilearn.collection.map;

import java.util.Map;
import java.util.TreeMap;


public class TreeMapd {

	public static void main(String[] args) {

    Map<String, Integer> mapofstreet = new TreeMap<String,Integer>();
    mapofstreet.put("alaska", 87221);
    mapofstreet.put("mexico", 10900);
    mapofstreet.put("gohana", 5362);
    mapofstreet.put("chandigarh", 9821);
    mapofstreet.put("alaska", 2683);
    System.out.println(mapofstreet);
    
    for(Map.Entry<String, Integer> entry : mapofstreet.entrySet()) {
    	System.out.println("key ::"+entry.getKey());
    	System.out.println("value ::"+entry.getValue());
    	System.out.println("------");
    }
    	
    
    
    
    
	}

}
