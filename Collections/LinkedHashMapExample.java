package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	
	public static void main(String args[]) {
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
		
		hm.put(102, "Ram");
		hm.put(100, "Mamta");
		hm.put(101, "Karan");
		hm.put(null, null);
		hm.put(null, "john");
		
		for(Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
