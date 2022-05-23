package org.base;

public class IndianBank extends AxisBank {
	public void indianbankAccount(String name) {
		System.out.println("Account holder name is :" +name);
    }
	public void indianbankAccount(long acctnumber) {
		System.out.println("Account number is :" +acctnumber);
    }
	public void indianbankAccount(int ifsc) {
		System.out.println("Branch IFSC code is :" +ifsc);
    }
	public static void main(String[] args) {
		IndianBank i = new IndianBank();
		i.indianbankAccount("Subash");
		i.indianbankAccount(1234567892l);
		i.indianbankAccount(0001234);
		i.deposit();
		i.fixed();
		
	}
	

}
