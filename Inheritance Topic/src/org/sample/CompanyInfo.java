package org.sample;

import org.base.ClientInfo;

public class CompanyInfo extends ClientInfo {
	public void compName() {
	     System.out.println("Company name is : Delta");

	}
	public void compId() {
		System.out.println("Company ID is : 343");

	}
	public static void main(String[] args) {
		CompanyInfo c = new CompanyInfo();
		c.compName();
		c.compId();
		c.clientId();
		c.clientName();
		c.empName();
		c.empId();
		
		
		// child class
		
	}

}
