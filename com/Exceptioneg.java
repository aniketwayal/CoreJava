package com;

public class Exceptioneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		System.out.println("Hi...");
		int a = 10;
		int b = a /0;
	System.out.println(b);   //arithmetic exception
		String b1 =null;
	System.out.println(b1.length()); //nullpointer exception
		
		String s ="Mamta B";
	//	int i = Integer.parseInt(s);
	//	System.out.println(i);   //NumberFormat exception
		
		int ar [] = new int [5];
		//ar[6]= 20;
		//System.out.println(ar[6]);
}


catch(ArithmeticException e) {
	System.out.println("cannot divide by zero");
}

catch(NullPointerException m) {
	System.out.println(m);
}

finally {
	System.out.println("Its me Itvedant");
}
String c = "Mamta";
System.out.println("my name is "+c);
System.out.println("how are you ?????????");


	}

}
