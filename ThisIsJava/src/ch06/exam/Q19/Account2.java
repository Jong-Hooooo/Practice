package ch06.exam.Q19;

public class Account2 {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		account.setBalance((10000));
		System.out.println("현재잔고: " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재잔고: " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재잔고: " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재잔고: " + account.getBalance());
	}

}
