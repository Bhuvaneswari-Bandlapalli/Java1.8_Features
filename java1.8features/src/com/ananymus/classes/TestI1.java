package com.ananymus.classes;

public class TestI1 {
	

	public static void main(String[] args) {
		I1 i1=new I1() {
			
			public int calc(int v1,int v2) {
				int c=v1*v2;
				return c;
				
			}
		};
		int d=i1.calc(2, 3);
		System.out.println(d);
	}

}
