package com.ananymus.classes;

import java.util.Scanner;

public class TestB {

	public static void main(String[] args) {
		B b=new B() {
			public int getNextValue(int a) {
			return a;
			}
		};
		
		int g=b.getNextValue(12);
		System.out.println(g);
	}

}
