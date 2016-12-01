package com.coding;

public class Strirev {
	
	
	String s2="";
	public String reverseString(String st){
		if(st.length()== 1){
			return st;
		}
		else{
			s2=s2+st.charAt(st.length()-1)+reverseString(st.substring(0,st.length()-1));
			return s2;
			
		}
	}
	
	

	public static void main(String[] args) {
		Strirev sr= new Strirev();
		System.out.println(sr.reverseString("rini"));

	}

}
