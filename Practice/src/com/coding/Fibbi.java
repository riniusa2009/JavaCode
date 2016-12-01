package com.coding;

public class Fibbi {

	public static void main(String[] args) {
		
	   int num =0,num1=1,num2;
	   System.out.println(num+":"+num1);
	   for(int i = 2;i<=10;i++){
		   num2= num+num1;
		   System.out.println(num2);
		   num=num1;
		   num1=num2;
		   
	   }
	
		
		
		
		
	}

}
