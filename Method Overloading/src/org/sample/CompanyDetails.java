package org.sample;

public class CompanyDetails {
	
	public void companyInfo(String name) {
		
		System.out.println("Employee name is :" +name);

	}
	public void companyInfo(String name, String email) {
		
		System.out.println("Employee name and email is : " +name +"\t"+ email);

	}
	public void companyInfo(long mobile) {
		System.out.println("Employee phone number is :"+mobile);

	}
	public void companyInfo(float salary) {
		System.out.println("Employee salary is :" +salary);

	}
	public void companyInfo(char gender, int empid) {
		System.out.println("Employee gender and employee id is :" +gender +empid);
   }
}
