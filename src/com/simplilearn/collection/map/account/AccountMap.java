package com.simplilearn.collection.map.account;

import java.util.LinkedHashMap;
import java.util.Map;

public class AccountMap {

	public static void main(String[] args) {
      Map<Integer, Account> accounttype = new LinkedHashMap<Integer, Account>();
      accounttype.put(10001, new Account(1001, "Tony Stark", 7153118.2));
      accounttype.put(10002, new Account(1002, "Arya Stark", 7152338.2));
      accounttype.put(10003, new Account(1003, "marry Stark", 231538.2));
      accounttype.put(10004, new Account(1004, "John Stark", 721538.2));
      accounttype.put(10005, new Account(1005, "Will Stark", 1538.2));
      System.out.println(accounttype);
      for(Map.Entry<Integer, Account> entry : accounttype.entrySet()) {
    	  System.out.println("key:"+entry.getKey());
    	  System.out.println("value:"+entry.getValue());
      }
      }

}
