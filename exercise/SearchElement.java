package com.exercise;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		int arr[]=new int[] {3,2,5,2,77,33,44,121,565,212,58};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to search: ");
		int num=sc.nextInt();
		int flag=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				flag=i+1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Number is not present in array.");
		}
		else {
			System.out.println("Number is found in "+flag+" locstion");
		}
	}

}
