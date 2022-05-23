package org.collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Map {

	public static void main(String[] args) {
          
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0, "Morning");
		hm.put(1, "Afternoon");
		hm.put(2, "Evening");
		hm.put(3, "MidNight");
		System.out.println(hm.remove(4));
		System.out.println(hm.size());
		Set<Entry<Integer,String>> obj = hm.entrySet();
		
		for (Entry<Integer, String> entry : obj) {
			
			System.out.println(entry);
			
		}
		/*Set s =hm.entrySet();
		Iterator i= s.iterator();
		while (i.hasNext()) {
			
			Map.Entry obj = (Map.Entry) i.next();
			
			
		}*/
		
	}

}
