package ch06.exam.Q19;

public class Account {
	
	private int balance;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	public int getBalance() {
		return this.balance;
	}
	
	public void setBalance(int balance) {
		if(this.balance + balance <= MAX_BALANCE && this.balance + balance >= MIN_BALANCE) {
		this.balance = this.balance + balance;
		}
	}
	
}
	
	


	