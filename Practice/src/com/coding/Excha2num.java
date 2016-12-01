package com.coding;
/*exchanging 2 no without 3*/

public class Excha2num {

	public static void main(String[] args) {

		int a1 = 2;
		int a2 = 3;
		System.out.println(a1);
		System.out.println(a2);
		
		a2=a1+a2;
		System.out.println("sum of a1 and a2"+":"+a2);
		a1=a2-a1;
		System.out.println("value of a1 after exchange "+a1);

		a2=a2-a1;
		System.out.println("value of a2 after exchange "+a2);

		
		
		
	}

}
