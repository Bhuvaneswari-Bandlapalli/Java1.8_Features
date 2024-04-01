package com.nonstaticinner;

public class Outer {
	public void m1() {
		System.out.println("outer class non static method");
	}
	public class Inner{
		public void m2() {
			System.out.println("inner class non static method");
		}
		
	}
	public static void main(String[] args) {
		Outer outer =new Outer();
		outer.m1();
		Outer.Inner inner=outer.new Inner();
		inner.m2();
	}

}
