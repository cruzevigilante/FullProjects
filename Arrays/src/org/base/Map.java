package org.base;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Map {
	
	
	
	public static void main(String[] args) {
		
		  HashMap<Integer, String> map=new HashMap<>();
		  map.put(10, "java");
		  map.put(20, "sql");
		  map.put(30, "ruby");
		  map.put(40, "python");
		  map.put(50, "c++");
		  
		  System.out.println(map);
		 String string = map.get(20);
		  System.out.println(string);
		  
		Collection<String> values = map.values();
		System.out.println(values);
		
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);
		
		
		
		Set<Entry<Integer,String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey());
			//System.out.println(entry);
			
			
		
			
		}
		
		
		
	}

}
