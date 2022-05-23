package org.pgms;

public class Reversiingnumber {

	void reversingNumber() {
		int a = 123;
		int rev = 0;
		
		while(a!=0) {
			rev = rev*10;
			rev = rev + a%10;
			a=a/10;
		}
		
		System.out.println(rev);
	}
	
	public static void main(String[] args) {
		Reversiingnumber r = new Reversiingnumber();
		r.reversingNumber();
	}
}
