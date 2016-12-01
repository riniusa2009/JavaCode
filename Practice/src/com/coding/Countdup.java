package com.coding;
/*duplicate characters in a string*/
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Countdup {
	
	public void countDupl(String st){
		Map<Character,Integer> map = new HashMap<Character,Integer>();
    	char[] chars= st.toCharArray();
    	for(Character ch:chars){
    		
    		
    		if(map.containsKey(ch)){
    			int count = map.get(ch);
    			map.put(ch, ++count);
    		    }
    			else
    			{
    				map.put(ch, 1);
    			}
    		}
    	
        Set<Character> keys = map.keySet();
    	for(Character ch:keys){
    		try{
    	      if(map.get(ch) > 1){
    	        System.out.println("Char "+ch+" "+map.get(ch));
    	      }
    		
    	    }
    		catch(Exception e){
    			System.out.println(e);
    		}
    	 }
    	}
       
	

	public static void main(String[] args) {
       Countdup dp = new Countdup();
       dp.countDupl("rini");
		
		
	}

}
