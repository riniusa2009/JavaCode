package com.coding;

import java.util.Scanner;

public class Negatarray {

	public void method1(){
		int t = -1;
		try{
			int a1[] = new int[t];
			
		}
		catch(NegativeArraySizeException  ex){
			System.out.println("Array index cannot be negative or zero");
			
		}
		
	}
		
	
	public static void main(String[] args) {
		Negatarray nr = new Negatarray();
		nr.method1();
			}
		}


