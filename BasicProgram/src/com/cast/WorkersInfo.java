
package com.cast;

import java.util.ArrayList;

public class WorkersInfo {

  public static void main(String[] args) {
	  
	  int [] arr = {1,2,3,4,5,6,7,8};
	  
	  for (int i = 0; i < arr.length; i++) {
		  if (arr[i]%2==0) {
			  System.out.println(arr[i]);
		}
		  }
	  ArrayList<String> a = new ArrayList<String>();
	  a.add("subash");
	  System.out.println(a);
	  
	  String s ="subash chandra bose";
	  String[] splitted = s.split(" ");
	  System.out.println(splitted[0]);
}
	

	}

