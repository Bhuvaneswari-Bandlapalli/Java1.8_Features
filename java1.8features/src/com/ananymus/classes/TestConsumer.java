package com.ananymus.classes;

public class TestConsumer {

	public static void main(String[] args) {
		Consumer con=new Consumer() {
			public void print(String s) {
				System.out.println(s);
			}
		};
		con.print("rukku");
	}

}
