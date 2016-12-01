package com.coding;

public class Multi {

	public static void main(String[] args) {

		
		for(int i =1;i<=50;i++){
		  if(i % 15 == 0 ) {
				 System.out.println( "fizzbuzzss" );
			}
		  else if(i % 5 == 0 ){
		 System.out.println( "buzz" );			
			}	
	    	else  if(i % 3 == 0 ) {
				 System.out.println( "fizz" );
			}	

			else{
				 System.out.println(i);

			}
   }
  }
 }
