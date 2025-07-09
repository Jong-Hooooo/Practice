package ch06.exam.Q20;

public class AccountA {

	private String account;  //계좌번호
	   private String name;   //계좌주
	   private int balance;  //초기 입금액
	   
	   
	   
	   public AccountA(String account , String name, int balance) {
	   this.account = account;
	   this.name = name;
	   this.balance = balance;
	   }
	   
	   
	   public String getAccount() {
	      return account;
	   }
	   
	   public String getName() {
	      return name;
	   }
	   
	   public int getBalance() {
	      return balance;   
	   }
	   
	   public void setAccount(String account) {
		      this.account = account;
		   }
		   
		   public void setName(String name) {
		      this.name = name;
		   }
		   
		   public void setBalance(int balance) {
		      this.balance = balance;
		   }
		}


