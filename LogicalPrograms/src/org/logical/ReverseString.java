package org.logical;

public class ReverseString {
	
	static String reverseAString(String input) {
		
		String rev="";
		for (int i = input.length()-1; i >=0; i--) {
			rev=rev+input.charAt(i);
			                                            //The charAt() method returns the character at the specified index in a string.
			}
		
		return rev;
		
		}
	
	public static void main(String[] args) {
		String reverseAString = reverseAString("shridhar");
		System.out.println(reverseAString);
	}
	
}
