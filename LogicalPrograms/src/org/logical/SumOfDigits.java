package org.logical;

public class SumOfDigits {

	   static int sumDigits(int a) {
		   
		   int sum=0;
		   while (a>0) {
			   int b=a/10;
			   int c=a%10;
			   sum=sum +c;
			   a=b;
			
		}
		return sum;   
          
	}
	
	public static void main(String[] args) {
		
		int sumDigits = sumDigits(657999888);
		System.out.println(sumDigits);
	}
}
