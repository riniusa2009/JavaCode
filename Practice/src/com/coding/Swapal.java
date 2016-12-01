package com.coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Swapal {

	public static void main(String[] args) {
  
	    ArrayList<String> al = new ArrayList<String>();
	    al.add("Rini");
	    al.add("Avik");
	    al.add("Brit");
	   
	    System.out.println("ArrayList before Swap"+":");
	    Iterator<String> it = al.iterator();
	    while(it.hasNext()){
	    	System.out.println(it.next());
	    }
	 
	    Collections.swap(al, 1, 2);

	    System.out.println("ArrayList after swap"+":");
	    Iterator<String> tt = al.iterator();

	    while(tt.hasNext()){
	    	System.out.println(tt.next());
	    }
 
       
       
	}

}
