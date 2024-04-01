package com.reduce.streams;

public class Student {
	private int id;
	private String name;
	private Integer age;
	private String qual;
	public Student(int id, String name, Integer age, String qual) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.qual = qual;
	}
	@Override
	public String toString() {
		return "Student : id=" + id + ", name=" + name + ", age=" + age + ", qual=" + qual ;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getQual() {
		return qual;
	}
	public void setQual(String qual) {
		this.qual = qual;
	}
	public Student() {
		super();
	}
	
	

}
