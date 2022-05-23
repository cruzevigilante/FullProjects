package org.pgms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class StringRev {
	
	public void usingStringBuffer() {
		
String st = "I am Agilan ";
		
		StringBuffer st1 = new StringBuffer();
		
		st1.append(st);
		st1.reverse();
		
		System.out.println(st1);
		
	}
	
	public void usingMethods() {
		 String st2 = "Selenium";
		 
		 char[] strArray = st2.toCharArray();
		 
		 String rev= "";
		 
		 for(int i=strArray.length-1;i>=0;i--) {
			 rev = rev + strArray[i];
		
		 }
		 System.out.println(rev);
	}
		 
		 public void usingCollections() {
			 
			 String st3 = "automation";
			 char[] charArrayCollection = st3.toCharArray();
			 List<Character> li = new ArrayList<Character>();
			 
			 for (Character character : charArrayCollection) {
				li.add(character);
			}
			 
			 Collections.reverse(li);
			 
			 ListIterator iterator = li.listIterator();
			 
			 while (iterator.hasNext()) {
				 System.out.print(iterator.next());
				
				
			}
			 
			 
		 } 
			 
		 
	
	public static void main(String[] args) {
		
		StringRev str = new StringRev();
	    str.usingStringBuffer();
	    str.usingMethods();
		str.usingCollections();
		
	}
}
	
		
	
	
	

