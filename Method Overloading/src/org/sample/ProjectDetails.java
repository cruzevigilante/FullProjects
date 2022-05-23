package org.sample;

public class ProjectDetails extends CompanyDetails {
	@Override
	public void companyInfo(String name) {
		super.companyInfo(name);
	}
	@Override
	public void companyInfo(String name, String email) {
		
		super.companyInfo(name, email);
	}
	@Override
	public void companyInfo(long mobile) {
		
		super.companyInfo(mobile);
	}
	@Override
	public void companyInfo(float salary) {
		
		super.companyInfo(salary);
	}
	@Override
	public void companyInfo(char gender, int empid) {
		
		super.companyInfo(gender, empid);
	}
	public static void main(String[] args) {
		ProjectDetails p = new ProjectDetails();
		p.companyInfo("subash");
		p.companyInfo("subash", "abc123@gmail.com");
		p.companyInfo(8489081984l);
		p.companyInfo(25000.500f);
		p.companyInfo('M'+"\t"+ 4125);
		}
	}
