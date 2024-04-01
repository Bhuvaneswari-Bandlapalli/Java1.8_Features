package com.lamdaexpressions;

public class LamdaExpre {

	public static void  main(String[] args) {
		A a=(k)->{
			return (int) (k*k);
			
		};
		int t=a.getValue(3);
		System.out.println(t);
		//implimentation
		
		
		B b=(h)->{
			System.out.println(h);
		};
		//implimentation 
		
		C c=()->{
			return 6;
		};
		int g=c.testC();
		System.out.println();
		//implimentation
		
		
		D d=(j)->{
			return j+j;
		};
		int f=d.testD(6);
		System.out.println(f);
		
		//implementation
		
		E e=(l)->{
			return ""+l;
			
		};
		String s=e.testE(90);
		System.out.println(s);
		
		
		
	}
	

}
