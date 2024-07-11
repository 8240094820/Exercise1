package com.exercise;

public class Palindrom {

	public static void main(String[] args) {
		
		String str="sandip";
		str=str.toLowerCase();
		String str1=" ";
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			str1=ch+str1;
		}
		System.out.println(str+ str1);
		if(str1.equals(str)) {
			System.out.println("That is a palindron.");
		}
		else {System.out.println("That is not a palindrom.");}

	}

	
}
