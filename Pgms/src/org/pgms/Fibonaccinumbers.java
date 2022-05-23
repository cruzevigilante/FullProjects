package org.pgms;

public class Fibonaccinumbers {
	
	void fibonacciNumbers() {
		int a = 1;
		int b = 2;
		int c;
		
		int count = 10;
		
		for(int i=0;i<count;i++) {
			c=a+b;
			System.out.println(c);
			
			a=b;
			b=c;
			
		}
		
		
	}
	public static void main(String[] args) {
		Fibonaccinumbers f =new Fibonaccinumbers();
		f.fibonacciNumbers();
	}

}
