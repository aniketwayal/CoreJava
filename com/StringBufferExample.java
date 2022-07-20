package com;

class StringBufferExample{
	public static void main(String [] args){
	//	StringBuffer s = new StringBuffer("Hellooo");
		StringBuilder s = new StringBuilder("Hellooo");
	//	s.append(" Everyone... Good evening");
	//	s.insert(1, "Mamta")	;
	//	s.replace(1, 4, "Good Morning  ");
	//	s.delete(1, 4);
		s.reverse();
		System.out.println(s);
		
		
	//	String s1 = "Hello";
		//s1.append("Everyone... Good evening");
	}

}