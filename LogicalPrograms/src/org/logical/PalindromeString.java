package org.logical;

public class PalindromeString {
	
	static String stringPalindrome(String input) {
		
		String rev="";
		String temp= input;
		for (int i = input.length()-1; i >=0; i--) {
			
			rev = rev +input.charAt(i);
			
			
		}
		if (temp.equals(rev)) {
			return "Palindrome String";
			
		} else {
			return "Non Palindrome String";

		}

	}
	public static void main(String[] args) {
		String stringPalindrome = stringPalindrome("malayalam");
		System.out.println(stringPalindrome);
	}
	
	
	

}
