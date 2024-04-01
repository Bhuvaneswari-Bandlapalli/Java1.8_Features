package com.innerclasses;

public class Outer {
	public static void m1() {
		System.out.println("outer static method");
	}
	public static class Inner{
		static void m2() {
			System.out.println("inner static method");
		}
		public void m3() {
			System.out.println("Non static meyhod inside the inner class");
		}
	}

	public static void main(String[] args) {
		Outer.m1();
		Outer.Inner.m2();
		Outer.Inner inner=new Outer.Inner();
		inner.m3();
	
	}

}
