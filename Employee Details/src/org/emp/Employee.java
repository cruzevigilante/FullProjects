package org.emp;

public class Employee {
	
	 public void empId() {
		 System.out.println("Employee ID is : 1234");
		 }
	 public void empName() {
		System.out.println("Employee Name is : Subash");

	}
	 public void empDob() {
	     System.out.println("Employee Date of birth is : 03/03/1995" );
	     }
	 public void empPhone() {
		System.out.println("Employee phone number is : 1234567899");

	}
	 public void empEmail() {
          System.out.println("Employee Email address is : abc@gmail.com");
	}
	 public void empAddress() {
	       System.out.println("Employee Adress is : 4th Main street, KK nagar, Chennai-67");

	}
	 public static void main(String[] args) {
		    Employee e = new Employee();
		    e.empId();
		    e.empName();
		    e.empDob();
		    e.empPhone();
		    e.empEmail();
		    e.empAddress();
		    
		    
		    
		    
		    
	}
	

}
