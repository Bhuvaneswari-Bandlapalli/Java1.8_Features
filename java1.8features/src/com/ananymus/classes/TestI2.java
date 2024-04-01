package com.ananymus.classes;

public class TestI2 {

	public static void main(String[] args) {
		I2 i2=new I2() {
			public String getText(int d) {
				return ""+d;
			}
		};
		String s=i2.getText(9) ;
		System.out.println(s);
	}

}
