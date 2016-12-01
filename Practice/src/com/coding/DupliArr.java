package com.coding;

import java.util.Arrays;

public class DupliArr {

    static void redup(int[] a)
    {
        System.out.println("Array With Duplicates : ");
         
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+"\t");
        }
         
        int al = a.length;
         
         
        for (int i = 0; i < al; i++) 
        {
            for (int j = i+1; j < al; j++)
            {
                 
                if(a[i] == a[j])
                {
                     
                    a[j] = a[al-1];
                     
                     
                    al--;
                     
                     
                    j--;
                }
            }
        }
         
         
        int[] aWD = Arrays.copyOf(a, al);
         
         
        System.out.println();
         
        System.out.println("Array Without Duplicates : ");
         
        for (int i = 0; i < aWD.length; i++)
        {
            System.out.print(aWD[i]+"\t");
        }
         
        System.out.println();
         
    }
     
    public static void main(String[] args) 
    {        
    	redup(new int[] {4, 3, 2, 4, 9, 2});
         
        } }
