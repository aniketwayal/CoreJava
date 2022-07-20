package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample1 {
	
	public void display() {
		ArrayList<Student> all = new ArrayList<Student>();
		
		all.add(new Student(1,"mamta",52.1));
		all.add(new Student(2,"priya",50.1));
		all.add(new Student(3,"sam",45.1));
		all.add(new Student(4,"john",52.1));
		all.add(new Student(5,"karan",50.1));
		all.add(new Student(6,"mamta",52.1));
		
//		Iterator<Student> i = all.iterator() ;
//		while(i.hasNext()) {
//			Student s = (Student) i.next();
		
		for (Student s : all) {
			System.out.println(s.id + " " + s.name + " "  + s.fees);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListExample1 ar = new ArrayListExample1();
		ar.display();
	}

}
