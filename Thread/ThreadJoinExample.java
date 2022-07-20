package Thread;

public class ThreadJoinExample extends Thread{
	
	public void run() {
		for(int i =1; i<=5;i++) 
		{
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadJoinExample t = new ThreadJoinExample();
		ThreadJoinExample t1 = new ThreadJoinExample();
		ThreadJoinExample t2 = new ThreadJoinExample();
		
		t.start();
		
	
		t1.start();
		t1.join();
		
		t2.start();
	}

}
