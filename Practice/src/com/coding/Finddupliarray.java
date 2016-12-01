package com.coding;

import java.util.Set;
import java.util.HashSet;

public class Finddupliarray {

	public static void main(String[] args) {
  
		int a1[] ={1,2,3,4,5,5,6};
		Set<Integer> s1= new HashSet<Integer>();
		for(int i=0;i<a1.length;i++){
			if(s1.add(a1[i])==false){
				System.out.println("Duplicate elemnet in array is "+":"+a1[i]);
				
			}
			
		}
		
		
	}

}
