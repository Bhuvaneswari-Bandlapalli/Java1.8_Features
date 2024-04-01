package com.ananymus.classes;

public class TestFunction {

	public static void main(String[] args) {
		Function f=new Function() {
			public String convertToRs(double d) {
				 
				 String s="Rs: "+d;
				 return s;
				
			}
		};
		String s=f.convertToRs(23);
		System.out.println(s);

	}

}
