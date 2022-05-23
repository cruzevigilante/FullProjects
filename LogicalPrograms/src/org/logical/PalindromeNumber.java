package org.logical;

public class PalindromeNumber {
	
	static String palindromeNum(int a) {
		
		int rev =0;
		int temp=a;
		while (a>0) {
			int b=a/10;
			int c=a%10;
			rev= c+(rev*10);
			a=b;
			
		}
		if (temp==rev) {
			return"Palindrome Number";
			
		} else {
			return "Not a Palindrome Number";
			}
		}
	
	public static void main(String[] args) {
		String palindromeNum = palindromeNum(121);
		System.out.println(palindromeNum);
	}

}
