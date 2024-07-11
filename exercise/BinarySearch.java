package com.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {4,2,6,3,9,6,22,99,1};
		
		Arrays.sort(arr);
		System.out.println("Enter the number to search: ");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int first=0;
		int last=arr.length-1;
		while(first<=last) {
			int mid=(first+last)/2;
			if (arr[mid]==n) {
				System.out.println("Number is found "+(mid+1)+" location");
				break;
			}
			else if(arr[mid]>n) {
				last=mid-1;
			}
			else {
				first=mid+1;
			}
			}
		if(first>last) {
			System.out.println("Number not found");
		}

}
}
