package org.base;

public class Duplicates {
	
	public static void main(String[] args) {
		int arr[]= {10,10,20,50,50,60,60,80};
	     
	     
	      int j =0;
	      int len=arr.length;
	      int temp[]= new int[len];
	      for (int i = 0; i < len-1; i++) {
	    	  if (arr[i]!=arr[i+1]) {
	    		  temp[j++]=arr[i];
	    		  
	    		  }
	      }
	    	  temp[j++]=arr[len-1];
	    	  
	    	  for (int k = 0; k < j; k++) {
	    		  System.out.println(temp[k]);
				
			}
			
		}
	
	      
	      
}

