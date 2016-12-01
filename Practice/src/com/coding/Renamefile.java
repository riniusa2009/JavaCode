package com.coding;
import java.io.*;

public class Renamefile {

	public static void main(String[] args) {

	    File Oldfilename = new File("C:\\Users\\Rini\\Desktop\\NewFileDelet.txt");	
	    File Newfilename = new File("C:\\Users\\Rini\\Desktop\\NewFileDelet1.txt");	

	   if(Oldfilename.exists()){
		   Oldfilename.renameTo(Newfilename);
		   Newfilename.delete();
	   }
	}

}
