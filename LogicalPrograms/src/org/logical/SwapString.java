package org.logical;

public class SwapString {
	public static void main(String[] args) {
		
		String s ="abc";
		String s1="def";
		s=s+s1;
        
		s1=s.substring(0, s.length()-s1.length());
        s=s.substring(s.length()-s1.length());
        System.out.println(s);
	}

}
