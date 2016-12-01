package com.coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Removeduplarra {

	public static void main(String[] args) {

		String a1[]={"a","d","r","r","p","e","k"};
		System.out.println("Array of String is "+"-"+ Arrays.toString(a1));
		
		List<String> list = Arrays.asList(a1);
		Set<String> st = new HashSet<String>(list);
				System.out.println("Removing duplicate array"+":"+ st );
				String result[] = new String[st.size()];
				st.toArray(result);
				for(String s:result){
					System.out.println(s);
				}
		
	}

}
