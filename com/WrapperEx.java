package abc;
public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
byte b =10;
short s =15;
int i =20;
long l= 47860;
float f= 48.70f;
double d= 74.156d;
char c='m';
boolean b1= true;

// autoboxing
	Byte objb = b;
	Short objs = s;
	Integer obji = i;
	Long objl = l;
	Float objf = f;
	Double objd= d;
	Character objc= c;
	Boolean obj = b1;
	
	System.out.println("Autoboxing");
	System.out.println("Values is " + objb);
	System.out.println("Values is " + objs);
	System.out.println("Values is " + obji);
	System.out.println("Values is " + objl);
	System.out.println("Values is " + objf);
	System.out.println("Values is " + objd);
	System.out.println("Values is " + objc);
	System.out.println("Values is " + obj);
	
	//unboxing
	Byte  b3= objb;
	Short  s1= objs;
	Integer i1 = obji;
	Long l1 = objl;
	Float f1 = objf;
	Double d1 = objd;
	Character c1= objc;
	Boolean b2 = obj;
	
	System.out.println("Unboxing");
	System.out.println("Values is " + b3);
	System.out.println("Values is " + s1);
	System.out.println("Values is " + i1);
	System.out.println("Values is " + l1);
	System.out.println("Values is " + f1);
	System.out.println("Values is " + d1);
	System.out.println("Values is " + c1);
	System.out.println("Values is " + b2);

}}
