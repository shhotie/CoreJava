package com.library.student;

import java.util.HashSet;

public class StudentUtils {

	public static HashSet <Student> getStudentSet(){
		HashSet<Student> studentSet = new HashSet<>();
		Student s = new Student("Swati", null);
		studentSet.add(s);
		s = new Student("Priya", null);
		studentSet.add(s);
		s = new Student("Sunita", null);
		studentSet.add(s);
		s = new Student("Menka", null);
		studentSet.add(s);
		return studentSet ;
		
	}
}
