package com.collection;

import java.util.ArrayList;
import java.util.*;

public class Convertaltohs {

	public void removeDuplicate(){
		
		ArrayList<String> st = new ArrayList<>();
		st.add("rini");
		st.add("Avik");
		st.add("chani");
		st.add("rini");
		
		 
		  LinkedHashSet<String> lhs = new LinkedHashSet<String>();
          lhs.addAll(st);
          st.clear();
          
		  Iterator<String> lh=lhs.iterator(); 
		  while(lh.hasNext()){
			  System.out.println(lh.next());
		  }
		
	}
	
	
	public static void main(String[] args) {

		Convertaltohs ah = new Convertaltohs();
		ah.removeDuplicate();
	}

}
