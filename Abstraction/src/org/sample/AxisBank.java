package org.sample;

public class AxisBank extends CitiBank {
	@Override
	public void savings() {
		System.out.println("Axis bank savings is : 2%");
		super.savings();
	}
	@Override
	public void deposit() {
		System.out.println("Axis bank deposit is : 3");
		super.deposit();
	}
	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.savings();
		a.deposit();
	}

	
	}
