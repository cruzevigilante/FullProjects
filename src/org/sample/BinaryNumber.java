package org.sample;

public class BinaryNumber {

	static void decToBinary(int n) {
		
		int[] binaryNum = new int [1000];  //array to store binary number
		
		//counter for binary array
		int i=0;
		while (n>0) {     //storing remainder in binary array
			binaryNum[i] = n%2;
			n=n/2;
			i++;
		}
		//printing binary array in reverse order
		for (int j = i-1; j >=0; j--) {
			System.out.println(binaryNum[j]);
			}
		}

	public static void main(String[] args) {
         int n=8;
         System.out.println("Decimal - " + n);
         System.out.println("Binary -");
         decToBinary(n);

	}

}
