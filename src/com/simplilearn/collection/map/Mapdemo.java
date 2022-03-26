package com.simplilearn.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Mapdemo {

	public static void main(String[] args) {
        Map<String,String> map1 = new HashMap<>();
        Map<String,String> map2 = new LinkedHashMap<>();
        Map<String,String> map3 = new TreeMap<>();
        
        Map<String,Long > phone = new HashMap<String, Long>();
        // 
        phone.put("malik", 98968841518L);
        phone.put("Manish", 989688432518L);
        phone.put("jatin", 989688452318L);
        phone.put("shivam", 9896823518L);
        phone.put("aman", 98968845318L);
        System.out.println(phone);

        System.out.println(phone.get("jatin:"+phone.get("jatin")));
        //iterate over map
        for(Map.Entry<String,Long> entry: phone.entrySet()) {
        	System.out.println("Key :"+entry.getKey());
        	System.out.println("value :"+entry.getValue());
        }

		
	}

}
