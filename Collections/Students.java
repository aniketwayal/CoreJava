package Collections;

public class Students implements Comparable<Students>{
	int id;
	String name;
	double fees;
	
	public Students(int id, String name, double fees) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.fees = fees;
	}

	@Override
	public int compareTo(Students o) {
		// TODO Auto-generated method stub
		if(fees == o.fees) {
			return 0;
		}
		else if(fees >o.fees)
			return 1;
		else 
			return -1;
	}
}
