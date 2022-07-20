package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList<Students> all = new ArrayList<Students>();
		
		all.add(new Students(1,"mamta",52.1));
		all.add(new Students(2,"priya",50.1));
		all.add(new Students(3,"sam",45.1));
		all.add(new Students(4,"john",62.1));
		all.add(new Students(5,"karan",80.1));
		all.add(new Students(6,"mamta",52.1));
		
		Collections.sort(all);
		for(Students a : all) {
			System.out.println(a.id + " " + a.name + " "  + a.fees);
		}
	}

}
