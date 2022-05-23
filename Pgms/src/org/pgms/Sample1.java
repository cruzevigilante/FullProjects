package org.pgms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import org.checkerframework.checker.units.qual.Length;

public class Sample1 {
	
	void usingMethod1() {
		
	String s1 = "i am agilan";
	
	StringBuffer strbuf = new StringBuffer();
	
	strbuf.append(s1);
	
	strbuf.reverse();
	
	System.out.println(strbuf);
	
		
		
	}
	
	void usingMethod() {
		
		String s2 = "asus rogue";
		
		char[] ar = s2.toCharArray();
		
		String rev = "";
		
		for(int i=ar.length-1;i>=0;i--) {
			rev = rev + ar[i];
		}
		
		System.out.println(rev);
	}
	void usingCollections() {
		String s3 = "i am agilan";
		
		char[] ar1 = s3.toCharArray();
		
		List<Character> li = new ArrayList<Character>();
		
		for (Character x:ar1) {
			li.add(x);
		}
		
		Collections.reverse(li);
		
		ListIterator iterator = li.listIterator();
		
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
		}
	}
	
	
		 
		 

	public static void main(String[] args) {
		Sample1 s = new Sample1();
		//s.usingMethod1();
		//s.usingMethod();
		s.usingCollections();
	}

}
