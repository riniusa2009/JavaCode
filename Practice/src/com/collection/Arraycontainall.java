package com.collection;

import java.util.*;

public class Arraycontainall {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("rini");
		al.add("avik");
		al.add("chani");
		al.add("deli");
		List<String> ll = new ArrayList<String>();
		ll.add("chani");
		ll.add("deli");
		if(al.containsAll(ll)){
			System.out.println("all strings of ll is present in al");
		}
		else{
			System.out.println("not contain all");
		}
	}

}
