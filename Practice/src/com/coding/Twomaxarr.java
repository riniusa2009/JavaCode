package com.coding;

public class Twomaxarr {

    public static void main(String args[]) {
        int a[] = { 3, 7, 9, 19 };
        int High = 0;
        int Secohi = 0;

        for (int i = 0; i < a.length; i++) {  
               if (High < a[i]) {
            	   Secohi = High;
                     High = a[i];
               } else if (Secohi < a[i]) {
            	   Secohi = a[i];
               }
        }

        System.out.println("First Highest is : " + High);
        System.out.println("Second Highest is : " + Secohi);
 }


}
