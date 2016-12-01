package com.coding;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Readingrepawords {

	public static void main(String[] args) {
        HashMap<String,Integer> wordcount= new HashMap<String,Integer>();
		
		BufferedReader reader=null;
		try{
			reader = new BufferedReader(new FileReader("C:/Users/Rini/Desktop/FileCheck.txt"));
			String Currentline = reader.readLine();
			while(Currentline!=null){
	        String words[] = Currentline.toLowerCase().split(" ");

	        for(String wor:words){
	        	
	        	if(wordcount.containsKey(wor)){
	        		
	        		wordcount.put(wor, wordcount.get(wor)+1);
	        	}
	        	else{
	        		wordcount.put(wor,1);
	        	}
	        	
	        }
	        
	        Currentline = reader.readLine();
	        String mostRep=null;
	        int count =0;
	        Set<Entry<String,Integer>> entrySet=wordcount.entrySet();
	        for(Entry<String,Integer> entry:entrySet){
	        	if(entry.getValue()>count){
	        		mostRep=entry.getKey();
	        		count=entry.getValue();
	        	}
	        }
	        System.out.println("The Most Repeated Word in File is :"+mostRep);
	        System.out.println("Number Of Occurrences : "+count);
			}
		}	
			catch(IOException e){
				e.printStackTrace();
				
			}
		finally{
			try{
				reader.close();
			}
			catch(IOException e){
				e.getMessage();
			}
		}
	}
}