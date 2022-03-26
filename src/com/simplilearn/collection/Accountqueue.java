package com.simplilearn.collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class Accountqueue {

	public static void main(String[] args) {
        Queue<Account> accountqueue = new ArrayDeque<Account>();
        accountqueue.add( new Account(1001,"Manish",5000));
        accountqueue.add( new Account(1002,"Ayushi",9000));
        accountqueue.add( new Account(1003,"Shivam",5100));
        accountqueue.add( new Account(1004,"jatin",5300));
        accountqueue.add( new Account(1005,"aman",5200));
        
        for(Account acc : accountqueue) {
        	System.out.println(acc.id);
        	System.out.println(acc.name);
        	System.out.println(acc.balane);
        	System.out.println("-----");
        }
        
	}

}
