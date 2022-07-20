package Thread;

	class FundTransfertask implements Runnable {


		Account sender;

		Account receiver;

		double amount;

		

		public FundTransfertask( Account sender, Account receiver, double amount ) {

			

			this.sender = sender;

			this.receiver = receiver;

			this.amount = amount;

			

			

		}
		public void run() {

			

			Thread thread = Thread.currentThread();

			

			double senderBalance = sender.getBalance();

			

	                      double receiverBalance = receiver.getBalance();

			

			if( ( senderBalance - amount ) >= 0 ) {

				

				receiver.setBalance(receiverBalance + amount);

				

				sender.setBalance(senderBalance - amount);

				

			}

			

			System.out.println(thread.getName()

					+"\n sender balance: "+sender.getBalance()

					+"\n receiver balance: "+receiver.getBalance());

		}

		

	}


