package com.coding;

public class Replachar {

	public static void main(String[] args) {
		String Str=new String("Rini");
		String s2 = "a100z";
		  System.out.print("Return Value :" );
	      System.out.println(Str.replace('i', 'T'));
		  String result = s2.replaceAll("a\\d\\d\\dz", "a---z");
	  	  System.out.println(result);
	    


	}

}
