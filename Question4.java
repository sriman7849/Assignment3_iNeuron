package com.ineuron.assignment3;

public class Question4 {
	public static void main(String[] args) {
		String str="The quick brown fox jumps over the lazy dog";
		boolean[] mark = new boolean[26];

		int index = 0;
		for (int i = 0; i < str.length(); i++) {

			if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
				index = str.charAt(i) - 'A';

			else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z')
				index = str.charAt(i) - 'a';

			else
				continue;

			mark[index] = true;
		}
		for(int i=0;i<26;++i) {
			if(mark[i]==false) {
				System.out.println("Not a Pangram");
				return;
			}
		}
		System.out.println("Is a Pangram");
	}
}
