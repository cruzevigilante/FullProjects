package org.pgms;

public class Vowels {
	
	void vowelCount() {
	String s = "agilihbihan";
	
	 s = s.toLowerCase();
	
	
	int vowelscount=0;
	int length = s.length();
	
	for(int i=0;i<length;i++) {
		if (s.charAt(i)== 'a'|| s.charAt(i)== 'e'|| s.charAt(i)== 'i'|| s.charAt(i)== 'o'|| s.charAt(i)== 'u'){
			
			vowelscount++;
		}
	}
		System.out.println(vowelscount);
		}
	}


