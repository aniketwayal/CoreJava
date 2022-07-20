class MethodExample{
	
	MethodExample(){
		
		
	}

public static void display(){ // default method

System.out.println("Good Evening");
}
final int n1 =20;

public void add( int n2, int n3){ //parameter method
	int result = n1 + n2 + n3; //120
	System.out.println("Addition is :" + result);
	
}

public int add1(int n1,int n2){ //parameter method with return keyword
	return n1 + n2; //100
}

public static void main(String args[]){

MethodExample.display();	 //calling static method

MethodExample e = new MethodExample();

e.add(100,78);  //calling non staitc method 
e.add(100,200);//calling non staitc method 
int res = e.add1(50,50); 
System.out.println(res);
}

}