package com.codewithsubash;

public class Primitive {
	public static void main(String[] args) {
		byte x = 1;
		byte y = x;
		x=2;
		System.out.println(y);
		
		//x and y are independent
		//Changing X does not change y
	}

}
