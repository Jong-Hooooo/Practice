package ch06.exam.Q20;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {

		Account[] accList= new Account[100];
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.println("선택> ");
			String strNum = scanner.nextLine();
			
			if(strNum.equals("1")) {
				System.out.println("-----------");
				System.out.println("계좌생성");
				System.out.println("-----------");
				System.out.println("계좌번호: ");
				String accNum = scanner.nextLine();
				System.out.println("예금주: ");
				String name = scanner.nextLine();
				System.out.println("초기입금액: ");
				int money = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("결과 : 계좌가 생성되었습니다");
				Account acc = new Account(accNum, name, money);
				for(int i = 0; i < accList.length; i++) {
					if(accList[i] == null) {
						accList[i] = acc;
						System.out.println("생성된 계좌번호: " + accList[i].accNum+ "  예금주: " + accList[i].name + "  초기입금액: " + accList[i].money);
						break;
					}	
				}
			}else if(strNum.equals("2")) {
				System.out.println("-----------");
				System.out.println("계좌목록");
				System.out.println("-----------");
				
				for(int i = 0; i < accList.length; i++) {
					if(accList[i] != null) {
						System.out.println("계좌번호: " + accList[i].accNum + "예금주: " + accList[i].name + "초기입금액: " + accList[i].money);
					}
				}
			}else if(strNum.equals("3")) {
				System.out.println("-----------");
				System.out.println("예금");
				System.out.println("-----------");
				System.out.println("계좌번호: ");
				String accNum = scanner.nextLine();
				
				for(int i = 0; i < accList.length; i++) {
					if(accList[i] != null && accList[i].accNum.equals(accNum)) {
						System.out.println("예금액: ");
						int balance = scanner.nextInt();
						scanner.nextLine();
						accList[i].money = accList[i].money + balance;
						System.out.println("현재 잔액: " + accList[i].money);
						System.out.println("예금이 완료되었습니다");
						break;
					}else if(accList[i] == null) {
						System.out.println("계좌번호를 찾을 수 없습니다");
						break;
					}
				}
			}else if(strNum.equals("4")){
				System.out.println("-----------");
				System.out.println("출금");
				System.out.println("-----------");
				System.out.println("계좌번호: ");
				String accNum = scanner.nextLine();
				
				for(int i = 0; i < accList.length; i++) {
					if(accList[i] != null && accList[i].accNum.equals(accNum)) {
						System.out.println("출금액: ");
						int balance = scanner.nextInt();
						scanner.nextLine();
						if(accList[i].money - balance >= 0) {
							accList[i].money = accList[i].money - balance;
							System.out.println("현재 잔액: " + accList[i].money);
							System.out.println("출금이 완료되었습니다");
							break;
						}else {
							System.out.println("잔액이 부족합니다");
							break;
						}	
					}else if(accList[i] == null) {
						System.out.println("계좌를 찾을 수 없습니다");
						break;
					}
				}
			}else if(strNum.equals("5")) {
				System.out.println("프로그램 종료");
				run = false;
			}
			System.out.println();
		}
	}	
}
















	