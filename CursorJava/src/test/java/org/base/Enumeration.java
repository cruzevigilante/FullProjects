package org.base;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Enumeration {

	public static void main(String[] args) {
                      
		Vector<String> v= new Vector<String>();
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		v.add("E");
		System.out.println(v);
		
		java.util.Enumeration<String> elements = v.elements();
		
		while (elements.hasMoreElements()) {
			
			String string = (String) elements.nextElement();
			System.out.println(string);
		}
		Iterator<String> it = v.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			if (string.equals("B")) {
                it.remove();				
			}
		}
		System.out.println(v);
		
		ListIterator<String> li = v.listIterator();
		while (li.hasNext()) {
			String next = li.next();
			if (next.equals("A")) {
				li.add("Java");
				
				
			}else if (next.equals("E")) {
				li.remove();
				
			}else if (next.equals("D")) {
				li.set("Bose");
				
			}
			
		}
		System.out.println(v);
       		
		
		
		
		
	}

}
