package org.logical;

public class ReplaceCharWithStar {

	public static void main(String[] args) {
             
		String s = "selenieum";
		int count =0;
		String output="";
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c=='e') {
				
				count++;
				for (int j = 0; j < count; j++) {
					
					output=output+'*';
					
					}
				
			}
			else {
				
				output=output+c;
			}
		}
		
		System.out.println(output);
	}

}
