package com.reduce.streams;

import java.util.Optional;
import java.util.stream.Stream;

public class ReduceTest {

	public static void main(String[] args) {
		Stream<Integer> values1=Stream.of(1,3,67,89,34,9);
		long num=values1.count();
		System.out.println(num);
	}
	public static void main6(String[] args) {
		Stream<Integer> values=Stream.of(1,3,67,89,34,9);
		Optional<Integer> r1=values.reduce((a,b)->{
			System.out.println("a: "+a+"b: "+b);
			return a+b;
		});
		System.out.println(r1.get());
		
		}
	
	
	public static void main5(String[] args) {
		Stream<Integer> values1=Stream.of(1,3,67,89,34,9);
		Optional<Integer> r=values1.reduce((a,b)->{
			if(a<b)
				return a;
			else return b;
			
		});
		System.out.println(r.get());
	}
	public static void main4(String[] args) {
		Stream<Integer> values1=Stream.of(1,3,67,89,34,9);
		Optional<Integer> r=values1.reduce((a,b)->{
			if(a>b)
				return a;
			else return b;
			
		});
				
		System.out.println(r.get());		
				
	}
    public static void main3(String[] args) {
    	Stream<String> str=Stream.of("a","m","O","U","g");
    	Optional<String> r=str.reduce((a,b)->{
    		return a+b;
    	});
    	System.out.println(r.get());
    	
	}
	public static void main2(String[] args) {
		Stream<String> str=Stream.of("a","m","O","U","g");
		Optional<String> yu=str.filter((a)->{
			if(a.equalsIgnoreCase("a") || a.equalsIgnoreCase("i") || a.equalsIgnoreCase("e")
					|| a.equalsIgnoreCase("u") || a.equalsIgnoreCase("o")) {
						return true;
	
            } else {
            	return false;
            }
			
	}).reduce((a,b)->{return a+b;});
		System.out.println(yu.get());
	
	}
	public static void main1(String[] args) {
		Stream<String> values=Stream.of("asdfg","mnkjui","yuioook","mjkioplniop");
		Optional<String>opt=values.reduce((a,b)->{
			if (a.length()>b.length()) return a;
			else return b;
		});
		System.out.println(opt.get());

	}

}
