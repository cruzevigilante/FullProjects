package org.collection;

import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		                                                   //Random Order
		hs.add("bose");
		hs.add("james");
		hs.add("cruze");                                   //no get method and index methods
		hs.add("strange");
		hs.add("bose");
		hs.add("1");
		System.out.println(hs);
		
		System.out.println(hs.size());
		
		System.out.println("===========");
		
		Iterator<String> iterator = hs.iterator();
		while (iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}

	}

}
