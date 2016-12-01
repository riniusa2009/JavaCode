package com.collection;

import java.util.HashSet;

public class DuplicateA {

	public static void main(String[] args) {

		
		String[] strArr = {"rini","avik","rini","chani"};
		HashSet<String> hs= new HashSet<String>();
		for(String arrayElement: strArr){
			
			if(!hs.add(arrayElement)){
				System.out.println("To check  duplicate values in a array" + ":" + arrayElement);
			}
			
			
		}
		
	}

}
