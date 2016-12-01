package com.coding;

import java.io.File;

public class Createdirect {

	public static void main(String[] args) {
		boolean b1 = false;
		File f1 = new File("C:\\Users\\Rini\\Desktop\\NewFol");
		try{
			b1=f1.mkdir();
			System.out.println("A new Directoy isCreated"+b1);
		}
		catch(Exception e){
	         e.printStackTrace();
			
		}
	}

}
