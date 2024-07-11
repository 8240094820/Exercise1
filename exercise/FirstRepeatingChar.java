package com.exercise;

public class FirstRepeatingChar {

	public static void main(String[] args) {
		String s="My name is Sandip Patra";
		s=s.toLowerCase();
		boolean found=false;
		int a=s.length();
		for(int i=0;i<a;i++) {
			for(int j=i+1;j<a;j++) {
				if(s.charAt(i)==s.charAt(j)) {
					System.out.println("First repetating character is: "+s.charAt(i));
					found= true;
					break;
				}
		
			}
			if(found) {
				break;
			}
		}
	}

}
