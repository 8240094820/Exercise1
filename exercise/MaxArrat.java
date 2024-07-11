package com.exercise;

public class MaxArrat {

	public static void main(String[] args) {
		int arr[]= new int[] {2,5,2,7,8,4,22,44,38,58,74,24,75,33};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
		if(max<arr[i]) {
			max=arr[i];
		}
		}
		System.out.println("Maximum element is: "+max);
		}

}
