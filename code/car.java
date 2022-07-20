 class car{

String brandname;
String color;
Double price;


public void speed(int speed){
System.out.println("I have " + speed +" speed per kilometer");
System.out.println("My name is " +brandname);
System.out.println("I am available in " +color);
System.out.println("Pay me " +price);
}

public static void main(String args[]){
car c = new car();
c.brandname="Audi";
c.color ="White";
c.price=7896400.12;



c.speed(75);
}

}