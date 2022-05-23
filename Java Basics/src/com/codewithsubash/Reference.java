package com.codewithsubash;

import java.awt.*;

public class Reference {
	public static void main(String[] args) {
		byte x = 1;
		byte y = 1;
		Point point1 = new Point(x,y);
		Point point2 =  point1;
		point1.x = 4;
		System.out.println(point2);
	 
		// X and Y are independent. stores references or address to the object point
		
	}

}
