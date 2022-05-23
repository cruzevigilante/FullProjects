package org.pgms;

public class lengthOfString {

	void lengthOfString() {
		String st = "agilan";
		
		char[] CH = st.toCharArray();
		 int length =0;
		 
		 for (Character x:CH) {
			 length++;
		 }
		 System.out.println(length);
	}
	public static void main(String[] args) {
		lengthOfString l =new lengthOfString();
		l.lengthOfString();
	}
}
