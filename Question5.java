package com.ineuron.assignment3;

public class Question5 {

	static final int size = 256;
    static char getMaxOccurringChar(String str)
    {
        
        int count[] = new int[size];
        int len = str.length();
        for (int i=0; i<len; i++) {
        	count[str.charAt(i)]++;
        }
        int max = -1;  
        char result = ' ';   
      
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        
        return result;
    }
     
    public static void main(String[] args)
    {
        String str = "Srimannarayana";
        System.out.println("Max occurring character is :" +
                            getMaxOccurringChar(str));
    }

}
