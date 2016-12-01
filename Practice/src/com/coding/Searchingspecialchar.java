package com.coding;

import java.io.BufferedReader;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Searchingspecialchar {
	
	public List<String> getDistinctword(String filename){
		FileInputStream fis = null;
		DataInputStream dis = null;
		BufferedReader br = null;
		List<String> newwordList = new ArrayList<String>();
		try{
			fis= new FileInputStream(filename);
			dis = new DataInputStream(fis);
			br= new BufferedReader(new InputStreamReader(dis));
			String line=null;
			while((line=br.readLine())!=null){
				StringTokenizer st = new StringTokenizer(line,",.;:\"");
				while(st.hasMoreTokens()){
					String  tem =st.nextToken().toLowerCase();
					if(!newwordList.contains(tem)){
						newwordList.add(tem);
					}
				}
			}
				
		}
		catch(FileNotFoundException e)
		{
		 e.printStackTrace();	
		}
		catch(IOException e){
			 e.printStackTrace();	
		}
		finally{
			try{
				if(br!=null)br.close();
			}
			catch(Exception e){
				System.out.println(e);
				
			}
		}
		return newwordList;
			
	}
	
	public static void main(String args[]){
		
		Searchingspecialchar scr = new Searchingspecialchar();
		List<String> wordlist = scr.getDistinctword("C:/Users/Rini/Desktop/example.txt");
		for(String st:wordlist){
			System.out.println(st);
			
			
		}
		
		
	}
	

}
