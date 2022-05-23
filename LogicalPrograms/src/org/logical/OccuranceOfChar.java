package org.logical;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceOfChar {
	
	static Map<Character, Integer> occuranceOfACharacter(String s) {
		
		char[] c= s.toCharArray();
		
         Map<Character,Integer> m= new LinkedHashMap<Character, Integer>();
         for (int i = 0; i < c.length; i++) {
        	 if (m.containsKey(c[i])) {
        		 Integer d = m.get(c[i]);
        		 m.put(c[i], d+1);
				
			} else {
				m.put(c[i], 1);

			}
			
		}
         return m;
	}
	public static void main(String[] args) {
		Map<Character,Integer> occuranceOfACharacter = occuranceOfACharacter("javaapplication");
		System.out.print(occuranceOfACharacter);
	}

}
