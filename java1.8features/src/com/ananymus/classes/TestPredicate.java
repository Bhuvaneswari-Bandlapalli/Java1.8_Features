package com.ananymus.classes;

public class TestPredicate {

	public static void main(String[] args) {
    Predicate p=new Predicate() {
    	public boolean isEven(int a) {
    		 double x=a%2;
    		 boolean y=(x==0)? true:false;
    		
    		return y;
    	}
    };
   boolean h= p.isEven(22);
    System.out.println(h);

	}

}
