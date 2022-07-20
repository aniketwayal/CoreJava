package com;

public class Student {
	
	private int rollNum;
	private String studNam; 
	private int mark1, mark2, mark3, totalMarks  ;
	
	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getStudNam() {
		return studNam;
	}

	public void setStudNam(String studNam) {
		this.studNam = studNam;
	}

	public int getMark1() {
		return mark1;
	}

	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}

	public int getMark2() {
		return mark2;
	}

	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}

	public int getMark3() {
		return mark3;
	}

	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}

	public void calculateTotal() {
		
		totalMarks = mark1 + mark2 + mark3 ;
	}
	
	public void displayStudDetails() {
		System.out.println("Roll no  : " +getRollNum());
		System.out.println("Name is  : " +getStudNam());
		System.out.println("Total marks  : " + totalMarks);
	}
	

	
}
