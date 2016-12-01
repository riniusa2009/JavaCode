package com.coding;

import java.util.TreeSet;

public class Treesecreatingobj {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Rini");
		ts.add("Anuj");
		ts.add("shash");
		ts.add("ana");
         System.out.println("values of treeset :"+ts);		
		System.out.println("Is treeset is empty :"+ts.isEmpty());
		ts.clear();
		System.out.println("Is treeset is empty ----"+ts.isEmpty());
		ts.add("one");
		ts.add("two");
		ts.add("three");
		System.out.println("Size of tree set is:"+ts.size());

		
		
	}

}
