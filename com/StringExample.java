package com;

public class StringExample {

	String s = "Mamta"; //using string literals
	String s1 = new String("Itvedeant") ;//using new keyword
	String s2 = new String("Mamta");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringExample obj = new StringExample();
		System.out.println("String first : " + obj.s);
		System.out.println("String second : " + obj.s1);
		System.out.println(obj.s == obj.s2); //false
		System.out.println(obj.s.equals(obj.s2)); //true
		System.out.println(obj.s1 == obj.s2);  //false
	}

}
