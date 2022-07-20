package Thread;

public class ThreadEg  implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEg t = new ThreadEg();
		ThreadEg t1 = new ThreadEg();
		ThreadEg t2 = new ThreadEg();
		
		Thread p = new Thread(t);
		Thread p1 = new Thread(t1);
		
		p.start();
		p1.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
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

	}


