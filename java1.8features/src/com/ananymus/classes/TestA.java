package com.ananymus.classes;

public class TestA {
	public static void main(String[] args) {
		A a=new A() { 
			public int getValue(long a) {
				
				int b=(int) a;
				System.out.println(b);
				return b;
				
			}
		};

		int d=a.getValue(1234);
		
		
		
	}
}
