package com.exercise;

public class CalculateSum {

	public static void main(String[] args) {
		int num=1234;
		String s=Integer.toString(num);
		int sum=0;
		for(int i=0;i<=s.length();i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
