package Thread;

public class ParallelExce  extends Thread{
	
	public void run() {
		for(int i =0; i<=5;i++) 
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParallelExce p = new ParallelExce();
		p.start();
	
		ParallelExce p1 = new ParallelExce();
		p1.start();
	}

}
