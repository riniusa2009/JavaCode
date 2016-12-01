package com.coding;

public class Singletonexam {
	
	private static Singletonexam obj1;
	
	private Singletonexam(){
		
	}
	
	public static Singletonexam getInstance(){
		if (obj1==null){
		obj1=new Singletonexam();
		}
		return obj1;
	}
 public void printMet(){
	 
	 System.out.println("New Instance is created");
	 
 }
}
