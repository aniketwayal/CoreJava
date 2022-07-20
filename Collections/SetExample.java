package Collections;

import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> al = new TreeSet<>();
		al.add("mahesh");
		al.add("mamta");
		al.add("ram");
		al.add("karan");
		al.add("arjun");
		al.add("mahesh");
		
		for (String s : al) {
			System.out.println(s);
		}
		
		SortedSet<Integer> all = new TreeSet<Integer>();
		all.add(10);
		all.add(15);
		all.add(10);
		all.add(1);
		all.add(78);
		
		for (Integer ab : all) {
			System.out.println(ab);
		}
		
		HashSet<Integer> al1 = new HashSet<Integer>();
		al1.add(10);
		al1.add(15);
		al1.add(10);
		al1.add(1);
		al1.add(78);
		
		for (Integer ab : al1) {
			System.out.println(ab);
		}
		
		LinkedHashSet<String> ab = new LinkedHashSet<String>();
		ab.add("Mango");
		ab.add("Apple");
		ab.add("Apple");
		ab.add("Grapes");
		ab.add("Watermelon");
		
		Iterator<String> itr = ab.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
