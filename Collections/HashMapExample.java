package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m = new HashMap<Integer, String>();
		m.put(1, "Mamta");
		m.put(2, "Rohan");
		m.put(3, "Aniket");
		m.put(4, "Arjun");
		m.put(5, "Sumeet");
		m.put(5, "Sumeet");
		
		//Convert map to set for traversing using iterator
//		Set s = m.entrySet(); 
//		
//		Iterator itr = s.iterator();
//		while (itr.hasNext()) {
//			Map.Entry e = (Entry) itr.next(); //Converting map.entry to get key & value
//			System.out.println(e.getKey() + " " + e.getValue());
		
		// Elements can traverse in any order
		for(Map.Entry e : m.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
		}
	

}
