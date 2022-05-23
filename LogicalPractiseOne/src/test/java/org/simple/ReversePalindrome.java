package org.simple;

public class ReversePalindrome {

	public static void main(String[] args) {
               
		String s="MalayalaM";
		
		String rev="";
		String temp=s;
		
		for (int i =s.length()-1;i>=0; i--) {
			rev=rev+s.charAt(i);
			
		}
		if (temp.equals(rev)) {
			System.out.println("Palindrome Number");
			
		}else {
			System.out.println("Non-palindrome Number");
		}
		
	}

}
