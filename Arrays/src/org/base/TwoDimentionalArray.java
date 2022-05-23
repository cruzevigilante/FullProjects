package org.base;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		
		
		int twoD [][] = new int [2][2];
		
		twoD[0][0]=10;
		twoD[0][1]=15;

		twoD[1][0]=20;

		twoD[1][1]=25;

				
		for (int i = 0; i < 2; i++) {
			
			//System.out.println(i);
			for (int j = 0; j < 2; j++) {
				//System.out.println(i);
				System.out.println(twoD[i][j]);


			}
				
			
			
		}
		
		
	}

}
