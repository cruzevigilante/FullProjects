package com.codewithsubash;

public class StringUses {
	public static void main(String[] args) {
		String message = "Hello World!!";
		
		System.out.println(message);
		
		System.out.println(message.replace('!', '*'));
		
		System.out.println("message length is :" +message.length());
		
		System.out.println(message.indexOf('o'));
		
		System.out.println(message.toLowerCase());
		
		String message1 = "Hello World"+"!!";
		System.out.println(message1.endsWith("!!"));
		
		String message2 = "  Hello World";
		System.out.println(message2.startsWith(" "));
		System.out.println(message2.trim());
		
		
	}

}

