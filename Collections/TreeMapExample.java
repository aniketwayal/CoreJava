package Collections;

import java.util.*;
import java.util.Map;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
		
		hm.put(102, "Ram");
		hm.put(100, "Mamta");
		hm.put(101, "Karan");
	//	hm.put(null, null);
		hm.put(105, null);
		
		for(Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
