package com.coding;
import java.util.Random;
import java.util.Scanner;

public class Rand {

	public static void main(String[] args) {
        int a;
		Random ra = new Random();
	      Scanner ine = new Scanner(System.in);
	      System.out.println("Enter an integer");
	      a = ine.nextInt();
	      System.out.println("You entered integer "+a);
		   int randomInt = ra.nextInt(99);
		   System.out.println(randomInt);
           if(a>randomInt){
        	   System.out.println("Try Lower");
           }
           if(a<randomInt){
        	   System.out.println("Try Higher");
           }
          
		
		
	}

}
