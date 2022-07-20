package Thread;

public class ThreadEg1 extends Thread{
	
	public void run() {
		System.out.println("I am Mamta");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEg1 t = new ThreadEg1();
		ThreadEg1 t1 = new ThreadEg1();
		ThreadEg1 t2 = new ThreadEg1();
		
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t.setName("Cat");
		System.out.println("t thread is : "+ t.getName() + " " +  t.getPriority());
		System.out.println("t1 thread is : "+ t1.getName() + " " + t1.getPriority());
		System.out.println("t2 thread is : "+ t2.getName() + " " + t2.getPriority());
		
		t.start();
		//t1.start();
		//t2.start();
		
		
	}

}
