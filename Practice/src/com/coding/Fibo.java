package com.coding;

public class Fibo {

	public static void main(String[] args) {
  
		int n1 =0;
		int n2 =1;
		int count = 10;
		for(int i =2;i<count;i++){
			
			int n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
			
			
			
		}
		
		
	}

}
