package org.simple;

public class SwapString {

	public static void main(String[] args) {
		String s = "subash";
		String s1 = "boseee";

		s = s + s1;

		s1 = s.substring(0, s.length() - s1.length());
		s = s.substring(s.length() - s1.length());
		System.out.println(s1);
		System.out.println(s);

	}

}
