package com.coding;

public class Multipleinh  implements Inter1,Int2 {
	  public void shape(){
		 System.out.println("shape of a circle is round");
		 
	 }
		public void color(){
			
			 System.out.println("color of a circle is yellow ");

			
		}

	 	
	public static void main(String[] args) {

		Multipleinh mn = new Multipleinh();
		mn.shape();
		mn.color();

	}

}
