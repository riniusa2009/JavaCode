package com.coding;

import java.util.Scanner;

public class Valipass {

	public void passcheck(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password :");
		String pass = sc.nextLine();
		System.out.println("Enter your Age :");
		int age = sc.nextInt();
		try{
		if(pass.length()<6 || age!=18){
			
			throw new Exception();
	    	}
		else{
		   System.out.println("Profile is created with "+"pass"+"age" );	
		 }
		}
		catch(Exception e){
			System.out.println("Password should be greater than 6 and age should be 18");
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		Valipass vp = new Valipass();
		vp.passcheck();
		
	}

}
