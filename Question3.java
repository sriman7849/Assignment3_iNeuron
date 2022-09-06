package com.ineuron.assignment3;

public class Question3 {
	static int chars = 256;
	
	static boolean areAnagram(char[] str1,char[] str2)
	{
	    int[] count = new int[chars];
	    
	    if (str1.length != str2.length)
	        return false;
	   
	   
	    for(int i = 0; i < str1.length; i++)
	    {
	        count[str1[i]]++;
	        count[str2[i]]--;
	    }
	 
	    
	    for(int i = 0; i < chars; i++)
	        if (count[i] != 0)
	        {
	            return false;
	        }
	    
	    return true;
	}
	 
	
	public static void main(String[] args)
	{
	    char str1[] = "sriman".toCharArray();
	    char str2[] = "namirs".toCharArray();
	 
	    
	    if (areAnagram(str1, str2))
	        System.out.print("Anagram");
	    else
	        System.out.print("Not Anagram");
	}
}
