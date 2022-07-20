package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student_Details> all = new ArrayList<Student_Details>();
		
		all.add(new Student_Details(1,"mamta",52.1));
		all.add(new Student_Details(2,"priya",50.1));
		all.add(new Student_Details(3,"sam",45.1));
		all.add(new Student_Details(4,"john",62.1));
		all.add(new Student_Details(5,"karan",80.1));
		all.add(new Student_Details(6,"mamta",52.1));
		
		System.out.println("Sorting by Fees");
		Collections.sort(all, new SortingByfees());
		Iterator itr = all.iterator();
		while(itr.hasNext()) {
			Student_Details st = (Student_Details) itr.next();
			System.out.println(st.id + " " + st.name + " " + st.fees);
		}
		
		System.out.println("Sorting by Name");
		Collections.sort(all, new SortingByName());
		Iterator itr1 = all.iterator();
		while(itr1.hasNext()) {
			Student_Details st = (Student_Details) itr1.next();
			System.out.println(st.id + " " + st.name + " " + st.fees);
		}

	}

}
