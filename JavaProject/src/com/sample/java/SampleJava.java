package com.sample.java;

import java.util.ArrayList;
import java.util.List;

import com.sample.java.bean.Student;

public class SampleJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> stdList = new ArrayList<Student>();

		stdList.add(new Student(101, "Geeth", "Ukg"));
		stdList.add(new Student(102, "Jigisha", "2nd"));
		stdList.add(new Student(103, "Jessi", "1st"));
		stdList.add(new Student(104, "Siri", "10Th"));
		stdList.add(new Student(105, "Hani", "Lkg"));

		for (Student names : stdList) {

			System.out.println(names);
		}

	}

}
