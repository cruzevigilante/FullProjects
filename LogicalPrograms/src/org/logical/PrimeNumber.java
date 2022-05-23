package org.logical;

public class PrimeNumber {
	
	static String checkPrimeNumber(int a) {
		
		int b=0;
		for (int i = 2; i < a; i++) {
			if (a%i==0) {
				
				b++;
				break;
			}
			if (b==0) {
				return "Prime Number";
			} 		}
		return "not a prime number";
	}
	public static void main(String[] args) {
		String checkPrimeNumber = checkPrimeNumber(8);
		System.out.println(checkPrimeNumber);
		
	}
}
		
           
	
