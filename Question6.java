package com.ineuron.assignment3;

import java.util.Arrays;

public class Question6 {
	public static void main(String[] args) {
		String str = "sriman";
		char charArray[] = str.toCharArray();
		Arrays.sort(charArray);
		System.out.println(new String(charArray)); //sorted array to string by passing array to the constructor
												   //of the String.
	}
}
