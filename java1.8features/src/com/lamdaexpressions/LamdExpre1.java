package com.lamdaexpressions;

public class LamdExpre1 {

	public static void main(String[] args) {

		I1 i=(r,p)->{
			return r+p;
		};
		int o=i.calc(89,90);
		System.out.println(o);
		
		//next
		I2 i2=(h)->{
			h=h+9;
			return h;
		};
		Consumer con=(l)->{
			System.out.println(l);
		};
		
		//lopifg
		Predicate pre=(s)->{
			if(s%2==0) {
				return true;
			}
			else {
				return false;
			}
			
		};
		boolean j=pre.isEven(89);
		System.out.println(j);
		//tyuiojhfdsd
		Function fun=(k)->{
			return "rupee "+k;
		};
		String p=fun.convertToRs(5678.90);

	}

}
