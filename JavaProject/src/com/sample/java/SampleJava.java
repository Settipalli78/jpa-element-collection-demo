package com.sample.java;

import java.util.ArrayList;
import java.util.List;

public class SampleJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> stringList=new ArrayList<String>();
		
		stringList.add("Prasad");
		stringList.add("Settipalli");
		stringList.add("GodhaSukeerthi");
		stringList.add("Settipalli");
		stringList.add("Geeth");
		
		for(String names: stringList) {
			
			System.out.println(names);
		}
		

	}

}
