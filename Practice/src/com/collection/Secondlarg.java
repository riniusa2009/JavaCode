package com.collection;

public class Secondlarg {

	public static void main(String[] args) {
		int numbers[] = {1,23,47,81,92,88,52,48,56,66,65,76,71,85,49,53,56,61,65,84};
		int largest = 0;
		 int second_largest = 0;
		for(int n:numbers){
		 
		if(largest < n){
		 
		      second_largest = largest;
		      largest =n;
		 
		 } else if(second_largest < n){
		 
		                second_largest = n;
		 
		}
		 
		}
		        System.out.println("largest number: "+largest);
		        System.out.println("largest number: "+second_largest);

		 
		 }
		 
}
