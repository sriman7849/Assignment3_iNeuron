package com.ineuron.assignment3;

public class Question2 {
	public static void main(String[] args) {
		String str="Think Twice";
		String words[]=str.split("\\s");  
		String reverseWord="";  
		for(String w:words){  
			StringBuilder sb=new StringBuilder(w);  
			sb.reverse();  
			reverseWord+=sb.toString()+" ";  
		}
		
		System.out.println(reverseWord.trim());
	}
}
