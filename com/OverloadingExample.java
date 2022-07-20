package com;

public class OverloadingExample {
	
	// same datatype but different parameter
	public void add(int n1, int n2) {
		int res = n1 + n2;
		System.out.println("Addition of method1 :" + res);
		
	}
	
public void add(int n1, int n2, int n3) {
	
	int res = n1 + n2 + n3;
	System.out.println("Addition of method2 :" + res);
	}

// same parameter but different datatype
public void add(double d, double e, double f, double g) {
	double res = d + e + f + g;
	System.out.println("Addition of method3 :" + res);
}

public void add(float nn1, float nn2, float nn3, float nn4) {
	float res = nn1 + nn2 + nn3 + nn4;
	System.out.println("Addition of method4 :" + res);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingExample o = new OverloadingExample();
		o.add(45, 80);
		//o.add(89, 70, 62);
		//o.add(10.2, 78.5, 45.4, 86.9);
		//o.add(8.1, 4.1, 5.6, 9.7);
	}

}
