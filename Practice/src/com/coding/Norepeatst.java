package com.coding;
/*write a program to find first non repeated character in given String*/

public class Norepeatst {

	public static char nonrepChar(String str)
            throws RuntimeException {
 
 
        char[] strChars = str.toCharArray();
        int length = strChars.length;
 
        for (int i = 0; i < length; i++) {
            boolean isRepeated = false;
            for (int j = 0; j < length; j++) {
 
                if (i != j && strChars[i] == strChars[j]) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                return strChars[i];
            }
        }
 
        throw new RuntimeException("All characters are repeating.");
    }
 
   
    public static void main(String[] args) {
        String str = "rini";
            System.out.println("First non repeating character in the string : "
                    + nonrepChar(str));
        
    }
}
