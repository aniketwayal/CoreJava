package com;

 class Animals{
	String color;
	
	public void eat (String n) {
		System.out.println("i am eating " +n);
	}
	
	public void show (String n) {
		System.out.println("name is : "+ n  + "color is : " + color);
	}
}

 
class Dog extends Animals{
	
	public void eat (String n) {
		System.out.println("i am eating " + n);
	}
}
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog g = new Dog();
g.color = "Black";
//g.show("abcccc");

Animals a = new Animals();
a.color = "White";
a = g;
a.show("anccc");

Animals a1 = new Animals();
Dog d = (Dog)a1;

	}

}
