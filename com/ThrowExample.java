package com;

import java.util.Scanner;

public class ThrowExample {
	public static void age(int n) throws  Exception{
		
		if (n <18) {
			throw new ArithmeticException("Person is small");
		}
		else 
		{
			System.out.println("Person is eligible");
		}
		
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter your age to caluclate");
		 int n = s.nextInt();
		 
		 age(n);
	}

}
