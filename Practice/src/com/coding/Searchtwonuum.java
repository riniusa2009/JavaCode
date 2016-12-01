package com.coding;

public class Searchtwonuum {

	public static void main(String[] args) {
    int a1[]={2,5,7,13,5,8,11};
    for(int i =0;i<a1.length;i++){
    	for(int j=1;j<a1.length;j++){
    		if(a1[i]+a1[j]==13){
   		System.out.println("Two numbers whose sum is 13 :"+a1[i]+"and"+a1[j]);
    		}
    	}
    	
   
    }
    
    
    
	}

}
