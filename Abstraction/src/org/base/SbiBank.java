package org.base;

public class SbiBank implements CitiBank {
	@Override
	public void savings() {
		System.out.println("CitiBank savings is : 6%");
	}
	@Override
	public void deposit() {
		System.out.println("CitiBank deposit is : 8%");
		
	}
	@Override
	public void fixed() {
		System.out.println("CitiBank fixed is : 10%");
		
	}
	public static void main(String[] args) {
		SbiBank s = new SbiBank();
		s.savings();
		s.deposit();
		s.fixed();
	}

}
