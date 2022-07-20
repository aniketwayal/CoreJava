package Thread;

public class Account {
	
	private double balance;

	public synchronized double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
