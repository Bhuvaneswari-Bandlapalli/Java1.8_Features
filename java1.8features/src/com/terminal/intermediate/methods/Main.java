package com.terminal.intermediate.methods;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static final void main(String[] args) {
		
		
	}
	public static List<Student> getStudents(){
		List<Student> students=new ArrayList<>();
		Student s1=new Student(1,"bhuvana",24,"b.tech");
		Student s2=new Student(2,"rukmini",22,"bsc");
		Student s3=new Student(3,"triveni",19,"b.tech");
		Student s4=new Student(4,"chandana",20,"b.tech");
		Student s5=new Student(5,"siri",21,"b.com");
		Student s6=new Student(6,"soni",22,"bsc");
		students.add(new Student(7,"roja",17,"inter"));
		students.add(s6);
		students.add(s5);
		students.add(s4);
		students.add(s3);
		students.add(s2);
		students.add(s1);
		return students;
		
		
	}

}
