 class ConstructorExample{
String brandname;
String color;
Double price;

ConstructorExample(String brandname, String c, Double p){
this.brandname = brandname;
this.color = c;
this.price = p;
}

public void speed(int speed){
System.out.println("I have " + speed +" speed per kilometer");
System.out.println("My name is " +brandname);
System.out.println("I am available in " +color);
System.out.println("Pay me " +price);
}

public static void main(String args[]){
 ConstructorExample c = new ConstructorExample("BMW","White",789654.456);

c.speed(75);
}

}