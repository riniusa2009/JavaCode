package com.coding;

import java.util.Scanner;

public class Namesasc {
	
	
	public void ascennam(){
		String temp;
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the value of k: ");
	    int k = sc.nextInt();
	    sc.nextLine();
        String sa[] = new String[k];
        System.out.println("Enter The Names" + ":" );
	    for(int i =0;i<k;i++){
	    sa[i]=sc.nextLine();	   
	   }
	   for (int i = 0; i < k; i++) 
       {
           for (int j = i+1; j < k; j++) 
           {
               if (sa[i].trim().compareTo(sa[j].trim())>0) 
               {
                   temp = sa[i];
                   sa[i] = sa[j];
                   sa[j] = temp;
               }
           }
       }
	   for(int l=0;l<k;l++){
		   System.out.println(sa[l]);
	   }
	}

	public static void main(String[] args) {
		Namesasc na = new  Namesasc();
		na.ascennam();
	}

}
