package com.coding;

public class Dupintwoarr {

	public static void main(String[] args) {

		int[] a1={1,2,3,7,9};
		int[] a2={2,4,6,7,11};
		int l = a1.length;
		int k = a2.length;
		for(int j = 0;j<l;j++){
			for(int i=0;i<k;i++){
				if(a1[j]==a2[i]){
					System.out.println(a1[j]+":"+"Is common in two Arrays");
				}
				
			}
		}
		
		
	}

}
