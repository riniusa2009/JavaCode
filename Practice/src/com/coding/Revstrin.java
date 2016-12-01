package com.coding;
public class Revstrin {

	public static void main(String[] args) {

		String st = "rini";
		String reverse="";
		int leng = st.length();
		for(int i =leng-1;i>=0;i-- ){
			reverse=reverse+st.charAt(i);
		}
		System.out.println(reverse);
	}

}
