package com.coding;
import java.io.*;

public class Createexistfile {

	public static void main(String[] args) {
    
		File Newfilename = new File("C:\\Users\\Rini\\Desktop\\NEWFILE.txt");	
        if(Newfilename.exists()){
        	System.out.println("File already exists");
        }
        else{
        	try{
        	Newfilename.createNewFile();
        }
        catch(Exception e){
        	System.out.println(e);
         }
        }
        System.out.println(Newfilename.getAbsolutePath());
        System.out.println(Newfilename.getName());
        System.out.println(Newfilename.isFile());
        System.out.println(Newfilename.isDirectory());
        
	}

}
