package com.reduce.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
public class MainS {
	
	public static void main(String[] args) {
		Optional<Integer> sum = getStudents().stream().map((s)->{
			 return s.getAge();
			}).reduce((a,b)->{
				return a+b;
			});
		
		System.out.println(sum);
	}

	public static void main6(String[] args) {
		List<String>	list = getStudents().stream().map((s)->{ 
				return s.getName();
				}).collect(Collectors.toList());
		System.out.println(list); 
	}

	
	
	public static void main5(String[] args) {

		List<Student> students = getStudents().stream().filter((s) -> {
			/*
			 * if(s.getQual().equalsIgnoreCase("btech")) { return true; }else return false;
			 */
			return s.getQual().equalsIgnoreCase("btech");
		}).collect(Collectors.toList());

		System.out.println(students);

	}
 	public static void main4(String[] args) {
	getStudents().stream().map( (a)->{
		return a.getName();
	}).forEach((a)->{
		System.out.println(a);
	});;
 	}


	public static void main3(String[] args) {
		Optional<Student> opt= getStudents().stream().reduce( (a,b)->{
			if(a.getAge()>b.getAge()) return a;
			else return b;
		});
		System.out.println(opt.get());
	}
	public static void main2(String[] args) {
		getStudents().stream().filter((a)->{
			 if (a.getQual().equalsIgnoreCase("mtech")) return true;
			 else return false;
		 }).forEach((a)->{
			 System.out.println(a);
		 });
			
	}

	   public static void main1(String[] args) {
		getStudents().stream().filter( (a)->{
			if(a.getAge()>24) return true;
			else return false;
		}).forEach(( a)->{
			System.out.println(a);
		});
	}
		public static List<Student> getStudents(){
			List<Student> student=new ArrayList<>();
			Student s1 = new  Student(1, "Bhuvana", 23, "Btech");
			Student s2 = new  Student(2, "Chinna", 24, "Mtech");
			Student s3 = new  Student(3, "jagathi", 27, "Bcam");
			Student s4 = new  Student(4, "vimala", 23, "Mca");
			student.add(s1);
			student.add(s2);
			student.add(s3);
			student.add(s4);
			
			return student;
		}

	}


