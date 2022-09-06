package com.ineuron.assignment3;

public class Question8 {
	public static void main(String[] args) {
		String str="sriman@#&%";
		int countSP=0;
		
		for(int i=0;i<str.length();++i) {
			char ch=str.charAt(i);
			if(ch>='a'&& ch<='z'|| ch>='A' && ch<='Z') {
				continue;
			}
			else {
				countSP++;
			}
		}
		
		System.out.println(countSP);
	}
}
