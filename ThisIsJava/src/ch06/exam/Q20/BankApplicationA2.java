package ch06.exam.Q20;
import java.util.Scanner;

public class BankApplicationA2 {
   
   static   Scanner scanner = new Scanner(System.in);
   static   Account[] accountList = new Account[100];
   
   public static void main(String[] args) {

      boolean run = true;
      
      while (run) {
         System.out.println("------------------------------------");
         System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
         System.out.println("------------------------------------");
         System.out.println("선택 : ");

         String num = scanner.nextLine();

         if (num.equals("1")) {
            account();

         } else if (num.equals("2")) {
            accountList();
            
         } else if (num.equals("3")) {

            deposit();
         } else if (num.equals("4")) {

            withdrew();
         } else if (num.equals("5")) {
            run = false;
         }

      }
      System.out.println("프로그램 종료");

   }
   
   
   
   static void account() { // 계좌생성
      System.out.println("-------");
      System.out.println("계좌생성");
      System.out.println("-------");
      System.out.println("계좌번호 : ");
      String accountNum = scanner.nextLine();
      System.out.println("계좌주 : ");
      String name = scanner.nextLine();
      System.out.println("초기입금액 : ");
      int balance = scanner.nextInt();
      scanner.nextLine();
      
      Account account = new Account(accountNum, name, balance);

      for (int i = 0; i < accountList.length; i++) {
         if (accountList[i] == null) {
            accountList[i] = account;
            break;
         }
      }

      System.out.println("결과 :  계좌가 생성되었습니다");

   }
   
   static void accountList() {  //계좌목록보기
      System.out.println("-----------");
      System.out.println("계좌목록");
      System.out.println("------------");

      for (int i = 0; i < accountList.length; i++) {
         if (accountList[i] != null) {
            System.out.println("계좌 : " + accountList[i].getAccount() +"   " +  accountList[i].getName() + "   " + accountList[i].getBalance());
         }
      }

      System.out.println("결과 :  계좌가 조회 되었습니다");

   }
   
   static void deposit() {
      System.out.println("-----------");
      System.out.println("예금");
      System.out.println("-----------");
      System.out.println("계좌번호 ");

      String num = scanner.nextLine();
      Account account =   fndAccount(num);
      if(account == null) {
         System.out.println("계좌를 찾을수 없습니다");
         return;
      }
      
      System.out.println("예금액 : ");
      int newBalance = scanner.nextInt();
      scanner.nextLine();
      account.setBalance(account.getBalance() + newBalance);
      System.out.println("예금이 되었습니다");
      
      
      
   }
   
   static void withdrew() {
      System.out.println("-----------");
      System.out.println("출금");
      System.out.println("-----------");
      System.out.println("계좌번호 ");

      String num = scanner.nextLine();
      Account account =   fndAccount(num);
      if(account == null) {
         System.out.println("계좌를 찾을수 없습니다");
         return;
      }
      
      System.out.println("출금액 : ");
      int newBalance = scanner.nextInt();
      scanner.nextLine();
      if(account.getBalance() - newBalance < 0) {
         System.out.println("잔액이 부족합니다");
         return;
      }else {
         account.setBalance(account.getBalance() - newBalance); 
         
      }
      
      System.out.println("출금이 되었습니다");
   
   }
   
   static Account fndAccount(String num) {
      for(Account account : accountList) {
         if(account != null && account.getAccount().equals(num)) {
            return account;
         }
         
      }
      return null;
   }


}