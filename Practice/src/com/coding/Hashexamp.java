package com.coding;

import java.util.HashMap;

public class Hashexamp {

	public static void main(String[] args) {
    
		HashMap<Integer,String> hma = new HashMap<Integer,String>();/*creating object*/
		hma.put(1, "Rini");/*adding object with a key*/
		hma.put(2, "Priya");
		hma.put(3, "Chani");
		hma.put(4, "Anvi");
        Integer key=2;
        String Value=hma.get(key);
        System.out.println(Value);/*getting value*/
        if(hma.isEmpty()){
        	System.out.println("hashmap is empty");
        }
        else{
        	System.out.println("hashmap contains value");

        }
        
        hma.remove(3);
        String Value1=hma.get(3);

        System.out.println(Value1);/*checking the deleted value*/
        System.out.println(hma.size());/*checking the size*/

        
        
	}
	
	

}
