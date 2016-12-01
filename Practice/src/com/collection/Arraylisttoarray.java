package com.collection;
import java.util.ArrayList;
import java.util.Iterator;

public class Arraylisttoarray {
	
	public void convert(){
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Rini");
		al.add("avik");
		al.add("chani");
		al.add("mom");
		
		Iterator<String> li=  al.iterator();// iterating the array list
		while(li.hasNext()){
			System.out.println(li.next());
			
		}
		
		String ar[] = new String[al.size()];
		for(int i=0;i<al.size();i++){
			ar[i]=al.get(i);
		}
		
		for(String k :ar ){
			System.out.println(k);

		}
		
		
		
		
	}
	
	
	
	public static void main(String args[]){
		
		Arraylisttoarray aa = new Arraylisttoarray();
		aa.convert();
		
		
	}
	
	

}
