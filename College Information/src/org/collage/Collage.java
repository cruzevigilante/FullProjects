package org.collage;

public class Collage {
	public void collegeName() {
		System.out.println("College Name is : ABC institute of technology");

	}
	public void collegeCode() {
		System.out.println("College code is : 1234");

	}
	public void collegeRank() {
		System.out.println("College Rank is : 2");

	}
	public static void main(String[] args) {
		Collage c = new Collage();
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		Student s = new Student();
		s.studentName();
		s.studentId();
		s.studentDept();
		Hostel h = new Hostel();
		h.hostelName();
		Dept d = new Dept();
		d.deptName();
		
	}

}
