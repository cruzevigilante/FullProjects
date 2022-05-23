package org.sample;

public class CitiBank implements KotakBank,SbiBank,YesBank {
	
	public void savings() {
		System.out.println("KotakBank savings is : 5%");
		SbiBank.super.savings();
		YesBank.super.savings();

	}
	public void deposit() {
		System.out.println("KotakBank deposit is : 6%");
		SbiBank.super.deposit();
		YesBank.super.deposit();
	}
public static void main(String[] args) {
	CitiBank c = new CitiBank();
	c.savings();
	c.deposit();
}
}
