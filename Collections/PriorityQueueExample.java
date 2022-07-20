package Collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> p = new PriorityQueue<String>();
		p.add("Rose");
		p.add("Sunflower");
		p.add("Lilly");
		p.add("Marigold");
		
		System.out.println("List is :");
		for(String a : p) {
			System.out.println(a);
		}
		
		p.remove();
		
		System.out.println("List after removal is : ");
		for(String a : p) {
			System.out.println(a);
		}
	}

}
