package com.coding;
/*wrapping string to integer without using parseInt*/

public class Wrapstrtoint {

	public static void main(String[] args) {
		String a1="2";
		Integer con =Integer.valueOf(a1);/*String object to numeric object*/
		int a2=con.intValue();/*converting integer object to primitive*/
		System.out.println(a2);
		
	}

}
