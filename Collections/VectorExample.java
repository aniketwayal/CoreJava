package Collections;

import java.util.Vector;

public class VectorExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vc = new Vector<>();
		vc.addElement(52);
		vc.addElement(45);
		vc.addElement(12);
		vc.addElement(45);
		
		for(int a : vc) {
			System.out.println(a);
		}
	}

}
