package com.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1st string: ");
		String ch1=sc.next();
		System.out.println("Enter the 2nd string: ");
		String ch2= sc.next();
		
		ch1=ch1.toLowerCase();
		ch2=ch2.toLowerCase();
		int a=ch1.length();
		int b=ch2.length();
		if(a!=b) {
			System.out.println("Not anagram.");
		}
		else {
			char a1[]= ch1.toCharArray();
			char b1[]= ch2.toCharArray();
			Arrays.sort(a1);
			Arrays.sort(b1);
			
			for(int i=0;i<=a;i++) {
				if(a1[i]!=b1[i]) {
					System.out.println("It is not anagram.");
				}
			else {
					System.out.println("It is an anagram.");
					break;
				}
			}
		}
		
	}

}
