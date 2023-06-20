package com.gana.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCollectioRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1,"ranga"),
				new Student(100,"laddu"),new Student(2,"karu"));
		ArrayList<Student> studentsAl = new ArrayList<>(students);
		System.out.println(studentsAl);
		Collections.sort(studentsAl);
		System.out.println(studentsAl);
		

	}

}
