package org.base;

public class CubBank implements CitiBank,KotakBank {

	@Override
	public void savings() {
		System.out.println("CitiBank Savings is : 8%");
		KotakBank.super.savings();
		
	}

	@Override
	public void deposit() {
		System.out.println("CitiBank deposit is : 9%");
		KotakBank.super.deposit();
		
	}

	@Override
	public void fixed() {
		System.out.println("CitiBank fixed is 12%");
		KotakBank.super.fixed();
		
	}
	public static void main(String[] args) {
		CubBank c = new CubBank();
		c.savings();
		c.deposit();
		c.fixed();
	}
	

}
