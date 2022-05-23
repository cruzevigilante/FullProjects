package org.logical;

public class CountTheDigits {
	
	static int countOfDigits(int a) {
            
		int count=0;
		while (a>0) {
			int b=a/10;
			//int c=a%10;
			count++;
			a=b;
			
		}
		return count;
		
		}
	
	public static void main(String[] args) {
		
		int countOfDigits = countOfDigits(123456);
		System.out.println(countOfDigits);
		
	}

}
