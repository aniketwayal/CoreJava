package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistExample {
	public void sample() {
	ArrayList<String> al = new ArrayList<>();
	al.add("mamta");
	al.add(0,"ram");
	al.add("karan");
	al.add("arjun");
	al.add(1,"bheem");
	al.add("seeta");
	al.add("krishna");
		System.out.println("ArrayList value are : " + al);
		System.out.println("No of Elements : " + al.size());
	al.remove(5);
	System.out.println("Updated arraylist after delete :" +al);
	System.out.println("Update size : " + al.size());

	System.out.print("Elements before Sorting : ");
	for(String a : al) {
		System.out.println(a);
	}
	System.out.print("Elements after Sorting : ");
	Collections.sort(al);
	for(String a : al) {
		
		System.out.println(a);
	}
	System.out.println("elements after reverse :  ");
	Collections.reverse(al);
	
for(String a : al) {
		
		
		System.out.println(a);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraylistExample a = new ArraylistExample();
		a.sample();
	}

}
