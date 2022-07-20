class Sample{
	
	static String name ="Mamta";
final String addr ="Vashi";
	String addr1 ="Seawooods";
	 static void myFunc(){
		System.out.println("I am method outside main");
		int i = 10;
		System.out.println(i);
		
	}
	

public static void main(String args[]){ //psvm
	
	System.out.println("I am Mamta");  //sysout

	Sample s = new Sample();
//	s.myFunc();
	System.out.println(name + " "+ s.addr);
Sample.myFunc();
	
}
}

	

