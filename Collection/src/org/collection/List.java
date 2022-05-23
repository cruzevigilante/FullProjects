package org.collection;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		
		
		ArrayList<String> aL = new ArrayList<String>();
		aL.add("bose");
		aL.add("cruze");
		aL.add("frank");
		aL.add("frank");
		System.out.println(aL);
		aL.add(0, "Rocky");
		System.out.println(aL);
		System.out.println(aL.size());
		boolean contains = aL.contains("miller");
		System.out.println(contains);
		aL.removeAll(aL);
		System.out.println(aL);
		boolean empty = aL.isEmpty();
		System.out.println(empty);
	}

}
