package com.coding;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Readinglineswordsfile {
	
	public static void mian(String args[]) {
		
		BufferedReader bf = null;
		int charCount=0;
		int wordCount=0;
		int lineCount=0;
		try{
		bf=new BufferedReader(new FileReader("C:/Users/Rini/Desktop/file test"));
		
		String currentline = bf.readLine();
		while(currentline!=null){
			lineCount++;
			String[] words = currentline.split("");
			wordCount=wordCount+words.length;
			for(String wor:words){
				
				charCount=charCount+wor.length();
				
			}
			
			currentline=bf.readLine();
		}
		
		System.out.println("Total characters count  are :"+charCount);
		System.out.println("Total words count are :"+wordCount);
		System.out.println("Total line count is :"+lineCount);
		
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	
	

}
