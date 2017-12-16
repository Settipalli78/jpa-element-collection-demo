package com.java.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapIteratorExample {

	public static void main(String[] args) {
		
		
		 // Creating a HashMap of int keys and String values
	    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
	    
	    HashMap<String, List<String>> hashmaNew = new HashMap<String, List<String>>();
	    
	    List<String> values=new ArrayList<String>();
	    
	    values.add("abc");
	    values.add("bcd");
	    
	    List<String> valuesOne=new ArrayList<String>();
	    
	    valuesOne.add("123");
	    valuesOne.add("234");
	    
	    hashmaNew.put("07/12/2017", values);
	    hashmaNew.put("06/12/2017", valuesOne);
	    
	    
	    System.out.println(">>>>>>>>>>>>>>>>>>>" +hashmaNew);
	    
	    
	    
	    
	    
	    
	 
	    // Adding Key and Value pairs to HashMap
	    hashmap.put(11,"Value1");
	    hashmap.put(22,"Value2");
	    hashmap.put(22,"Test");
	    hashmap.put(22,"Test1");
	    hashmap.put(33,"Value3");
	    hashmap.put(44,"Value4");
	    hashmap.put(55,"Value5");
	    
	    
	    System.out.println(hashmap.get(33));
	 
	    // Getting a Set of Key-value pairs
	    Set entrySet = hashmaNew.entrySet();
	 
	    // Obtaining an iterator for the entry set
	    Iterator it = entrySet.iterator();
	 
	    // Iterate through HashMap entries(Key-Value pairs)
	    System.out.println("HashMap Key-Value Pairs : ");
	    while(it.hasNext()){
	       Map.Entry me = (Map.Entry)it.next();
	       System.out.println("Key is: "+me.getKey() + 
	       " & " + 
	       " value is: "+me.getValue());  
	       
	       
	   }
	 }

	}


