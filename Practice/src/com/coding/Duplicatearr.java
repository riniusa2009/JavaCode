package com.coding;

import java.util.HashSet;

public class Duplicatearr {

public static void main(String[] args) {

		
		Integer[] strArr = {1,2,3,4,5,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
		HashSet<Integer> hs= new HashSet<Integer>();
		for(Integer arrayElement: strArr){
			
			if(!hs.add(arrayElement)){
				System.out.println("To check  duplicate values in a array" + ":" + arrayElement);
			}
			
			
		}
		
	}

}
