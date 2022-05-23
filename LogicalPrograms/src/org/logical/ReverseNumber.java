package org.logical;

public class ReverseNumber {
	
	static int reverseNumber(int a) {
		
		int rev =0;
		while (a>0) {
			
			int b= a/10;
			int c=a%10;
			rev = c+(rev*10);
			a=b;
			
		}
           
		return rev;
		
	}
	public static void main(String[] args) {
		int reverseNumber = reverseNumber(1234);
		System.out.println(reverseNumber);
	}

}
