package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
	
	public void sample() {
	LinkedList<String> al = new LinkedList<>();
	al.add("mahesh");
	al.add("mamta");
	al.add("ram");
	al.add("karan");
	al.add("arjun");
	al.add("bheem");
	al.add("seeta");
	al.add("krishna");
	al.add("seeta");	
	
//	Iterator<String> it = al.iterator();
//	while (it.hasNext()) {
//		System.out.println(it.next());
//	}
//	}
	
	al.remove(2);
	ListIterator<String> it = al.listIterator();
	System.out.println("Traversing in forward direction ");
	while(it.hasNext()) {
		System.out.println(it.nextIndex() + " " + it.next());
		}
	
	System.out.println("Traversing in backward direction ");
	while(it.hasPrevious()) {
		System.out.println(it.previousIndex() + " " + it.previous());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListExample e = new LinkedListExample();
		e.sample();
	}

}
