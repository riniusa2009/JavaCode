package com.coding;

import java.util.ArrayList;

public class Crearrayobj {
	public static void main(String args[]){
		ArrayList<String> obj1 = new ArrayList<String>();
		obj1.add("Rini");
		obj1.add("shash");
		obj1.add("Rav");
		obj1.add("Risha");
		System.out.println("Displaying the object elements"+obj1);
		System.out.println("Adding the elemnets on particular indexes");
		obj1.add(4,"Ana");
		obj1.add(5,"Naq");
		System.out.println("Displaying the object with more elements"+obj1);
        obj1.remove(1);
        obj1.remove(3);
		System.out.println("Displaying the object after removing elements"+obj1);
        int indexse = obj1.indexOf("Naq");
        System.out.println("Elements is present on particular index or not "+ indexse);
        int size =obj1.size();
        System.out.println("Size of arraylist "+ size);
        boolean t = obj1.isEmpty();
        System.out.println(" Arraylist is empty or not"+":"+ t);

		
	
		
		
		
		
		
		
	}
	
	

}
