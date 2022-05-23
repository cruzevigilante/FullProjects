package org.base;

public class FriendAge {
	
       public static int a;
       
   public void friendAge() {
	                                           //  Static Variable
	this.a = 28;

}
   public static void main(String[] args) {
	System.out.println(a);
	FriendAge f = new FriendAge();
	f.friendAge();
	System.out.println(a);
}
}
