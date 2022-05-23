package org.base;

public class InterviewQuestion {   //find the largest number located in the column of the minimum number of the whole elements
	
	public static void main(String[] args) {
		
		int abc[][]= {{2,4,5},{3,2,10},{1,2,0}};
		
		int min = abc[0][0];
		int mincolumn=0;
		
		
		for (int i = 0; i < abc.length; i++) {
			
			  for (int j = 0; j < abc.length; j++) {
				  
				  if (abc[i][j]<min) {
					  min=abc[i][j];
					  mincolumn=j;
		             }				
			}
			 }
		
		int max=abc[0][mincolumn];
		int k=0;
		while (k<3) {
			
			if (abc[k][mincolumn]>max) {
				max=abc[k][mincolumn];
				
			}
			k++;
			
		}
		System.out.println(max);
		
		
	}

}
