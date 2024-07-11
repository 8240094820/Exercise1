package com.exercise;

public class FindMissingNumber {

	public static void main(String[] args) {
		int n=5;
		int arr[]=new int[] {1,2,3,5};
		int sum=0;
		for(int i=0;i<n-1;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
		int totalsum= n*(n+1)/2;
		int missing = totalsum-sum;
		System.out.println("The missing item is: "+missing);

	}

}
