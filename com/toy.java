package com;

public class toy implements mickey{


	
	public static void main(String[] args) {
		String name ="i am child";
		System.out.println(name);
		
		// TODO Auto-generated method stub
		toy obj = new toy();
	//	obj.panda();
		obj.teddy();  //default method
		mickey.unicorn(); //static method
	}

	

	@Override
	public void teddy() {
		// TODO Auto-generated method stub
		
	}

	

}
