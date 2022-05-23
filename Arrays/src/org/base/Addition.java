package org.base;

import java.util.Arrays;

public class Addition {
	public static void main(String[] args) {
		
		int a []= new int [10];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		a[5]=6;
		a[6]=7;
		a[7]=8;
		a[8]=9;
		a[9]=10;
		int count = a.length;
		
		System.out.println(count);
			
			int b=count*(count+1);	
			int c = b/2;
			System.out.println(c);
			
			System.out.println("=========");
			
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			
		}
		
       System.out.println(sum);
      double average = sum/a.length;
      
      System.out.println("average of the elements of array is"+ " " +average);
      System.out.println("=======Remove Duplicates=========");
      
      int arr[]= new int[8];
      arr[0]=10;
      arr[1]=10;
      arr[2]=20;
      arr[3]=50;
      arr[4]=60;
      arr[5]=80;
      arr[6]=60;
      arr[7]=50;
      Arrays.sort(arr);
      for (int j = 0; j < arr.length; j++) {
    	  System.out.println(arr[j]);
    	  
		}
      int j=0;
      for (int i = 0; i < arr.length-1; i++) {
    	  if (arr[i]!=arr[i+1]) {
    		  System.out.println(arr[j]);
    		  j++;
			
		}
		
	}
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
		
	}
	//To remove duplicates
	//int ar [] = new int [8];
	
	//ar[0]=10;
    //10,10,20,50,60,80,60,50
	
}
