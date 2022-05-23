package org.sample;

public class CanaraBank extends HdfcBank {
		@Override
	public void iciciSavings() {
		System.out.println("ICICI savings is : 5%");
		
	}
	@Override
	public void iciciDeposit() {
		System.out.println("ICICI deposit is : 8%");
		
	}
	@Override
	public void indianSavings() {
		System.out.println("Indianbank savings is : 5%");
		
	}
	@Override
	public void indianDeposit() {
		System.out.println("IndianBank deposit is : 6%");
		
	}
	
	@Override
	public void hdfcSavings() {
		System.out.println("Hdfc savings is : 7%");
		
	}
	@Override
	public void hdfcDeposit() {
		System.out.println("Hdfc deposit is : 4%");
		
	}
	public static void main(String[] args) {
		CanaraBank b = new CanaraBank();
		b.hdfcSavings();
		b.hdfcDeposit();
		b.iciciSavings();
		b.iciciDeposit();
		b.indianSavings();
		b.indianDeposit();
		
	}
	
}


		
