package ch06.exam.Q20;

import java.util.Scanner;

public class BankApplicationE {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		
		while(run) {
		System.out.println("----------------------------------");
		System.out.println("1.계좌생성 2.계좌목록 3.입금 4.출금 5.종료");
		System.out.println("----------------------------------");
		System.out.println("선택> ");
		String strNum = scanner.nextLine();
			if(strNum.equals("1")) {
				System.out.println("-------------");
				System.out.println("계좌생성");
				System.out.println("-------------");
				System.out.println("계좌번호: ");
				 
			}
		}
	}
}
