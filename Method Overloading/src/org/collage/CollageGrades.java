package org.collage;

public class CollageGrades {
	
	public void studentInfo(String name) {
		this.studentInfo(32, 'S');
		System.out.println("Student name is :" +name);
     }
	public void studentInfo(long phnumber) {
		System.out.println("Student Phone Number is :" +phnumber);
     }
	public void studentInfo(String name, String address) {
		this.studentInfo(25000.500f);
		System.out.println("Student father's name and address :" +name + address);
     }
	public void studentInfo(float fees) {
		this.studentInfo('A');
		System.out.println("Student yearly fees is :" +fees);
     }
	public void studentInfo(char enggrade) {
		this.studentInfo(32, 'S');
		System.out.println("English grade is :" +enggrade);

	}
	public void studentInfo(int IDnum, char mathgrade) {
		this.studentInfo(8489081984l);
		System.out.println("Student IDcard no and Math grade is :" +IDnum+"\t"+mathgrade);

	}
	public static void main(String[] args) {
		CollageGrades c = new CollageGrades();
		c.studentInfo("Subash");
	}
	
	

}
