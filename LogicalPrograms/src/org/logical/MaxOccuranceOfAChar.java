package org.logical;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MaxOccuranceOfAChar {

	public static void main(String[] args) {
		
		
		String s="automationtester";
		String output="";
		Map<Character, Integer> map=new LinkedHashMap<>();
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				Integer integer = map.get(c);
				map.put(c, integer+1);
			} else {
                   map.put(c, 1);
			}
			
		}
		char maxchar=' ';
		int maxvalue=0;
		Set<Entry<Character, Integer>> entryset=map.entrySet();
		for (Entry<Character,Integer> entry : entryset) {
			
			
			Integer value = entry.getValue();
			if (value<maxvalue) {
				maxvalue=value;
				maxchar=entry.getKey();
				
			}
			
		}
		System.out.println(maxchar);
		
	}

}
