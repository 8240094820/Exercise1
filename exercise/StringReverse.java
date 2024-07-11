package com.exercise;

public class StringReverse {

	public static void main(String[] args) {
		String str="i love code";
		System.out.println("Before reverse string is: "+str);
		String str1=" ";
		
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			str1= ch+str1;
		}
		System.out.println("After reverse string is: "+str1);

	}

}
