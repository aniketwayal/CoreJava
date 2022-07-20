package com;

public class StudentDemo {
	public static void main (String args[]) {
		Student s = new Student();
		
		s.setRollNum(101);
		s.setStudNam("mamta");
		s.setMark1(50);
		s.setMark2(78);
		s.setMark3(95);
		s.calculateTotal();
		s.displayStudDetails();
		
	}
}
