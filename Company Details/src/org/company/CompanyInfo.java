package org.company;

public class CompanyInfo {
	public void companyName() {
		System.out.println("Company Name is : Delta");
		}
	public void companyId() {
	System.out.println("Company ID is : 41253");
      }
	public void companyAddress() {
		System.out.println("Company Address is : Chennai");
		}
	public static void main(String[] args) {
		CompanyInfo t = new CompanyInfo();
		t.companyName();
		t.companyAddress();
		t.companyId();
		
	}

}
