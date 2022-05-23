package com.codewithsubash;

public class EscapeSequence {
	public static void main(String[] args) {
		
		String message = "Hello \"World\"";
		System.out.println(message);
		
		String message1 = "c:\\windows\\..";
		System.out.println(message1);
		System.out.println("c:\nwindows\\..");
		System.out.println("c:\twindows\\..");
		
	}

}
