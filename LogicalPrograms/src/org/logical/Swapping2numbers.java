package org.logical;

public class Swapping2numbers {
	
	void swappingNumbers() {
	
	int a = 10;
	int b = 35;
	int temp = 0;
	
	
	temp = a;
	a=b;
	b=temp;
	
	System.out.println(a);
	System.out.println(b);
}
	public static void main(String[] args) {
		
		Swapping2numbers s = new Swapping2numbers();
		s.swappingNumbers();
		
	}
	
}

