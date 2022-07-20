package Collections;

import java.util.*;

public class DeQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> p = new ArrayDeque<String>();
		p.add("Rose");
		p.add("Sunflower");
		p.add("Lilly");
		p.add("Marigold");
		
		System.out.println("List is :");
		for(String a : p) {
			System.out.println(a);
		}
		
	p.remove();
	p.add("Lotus");
	p.removeLast();
		
System.out.println("List after removal is : ");
	for(String a : p) {
		System.out.println(a);
	}

	}

}
