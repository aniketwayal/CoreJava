package Collections;

import java.util.Comparator;

public class SortingByName implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student_Details s1 = (Student_Details) o1;
		Student_Details s2 = (Student_Details) o2;
		
		return s1.name.compareTo(s2.name);
	}

}
