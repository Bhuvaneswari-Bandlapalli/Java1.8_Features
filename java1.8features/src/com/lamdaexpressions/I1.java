package com.lamdaexpressions;

public interface I1 {
	
		public int calc(int a,int b);
}
interface I2{
	public int getNextValue(int a);
}
interface Consumer {
	public void print(String g);
}
interface Predicate{
	public boolean isEven(int a);
}
interface Function{
	public String convertToRs(double b);
}