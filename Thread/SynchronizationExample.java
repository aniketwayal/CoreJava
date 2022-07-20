package Thread;

public class SynchronizationExample {

	public static void main(String[] args) {
		Account sender = new Account();

		sender.setBalance(2000);

		

		Account receiver1 = new Account();

                      receiver1.setBalance(0);

                      Account receiver2 = new Account();

                      receiver2.setBalance(0);

       

		

	           Thread t1 = new Thread(new FundTransfertask( sender,receiver1,2000));

		

	           Thread t2 = new Thread(new FundTransfertask( sender,receiver2,2000));

		

	           t1.setName("Netbanking");

	    

	           t2.setName("ATM");
		t1.start();
		t2.start();
		

	}
}
