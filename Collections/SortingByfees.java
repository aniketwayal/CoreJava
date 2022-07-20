package Collections;

import java.util.Comparator;

public class SortingByfees implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student_Details s1 = (Student_Details) o1;
		Student_Details s2 = (Student_Details) o2;
		
		if(s1.fees == s2.fees) {
			return 0;
		}
		else if(s1.fees >s2.fees)
			return 1;
		else 
			return -1;
		
	}

}
