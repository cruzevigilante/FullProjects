package org.logical;

public class DuplicateRemoval {
	
	
	public static void main(String[] args) {
		
		String s="automationtester";
		String output="";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (output.indexOf(c)==-1) {
				output=output+c;
				
			}
			
		}
		
		System.out.println(output);
	}

}
