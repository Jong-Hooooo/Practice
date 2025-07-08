package ch01.sec08;

import java.util.Scanner;

public class Exam0418 {

	public static void main(String[] args) {
		    //Q3
		    int sum = 0;
        
		    for(int i = 1; i <= 100; i++) {
				
				if(i % 3 == 0) {
				   sum = sum + 1;
				   //짝수면 i % 2 == 0

			//Q4
			while(true) {
				
			int num1 = (int)(Math.random() * 6) + 1;
			int num2 = (int)(Math.random() * 6) + 1;
					
			int result = num1 + num2;
			if(result != 5) {
				System.out.println("( " + num1 + ", " + num2 + ")");
				}else{
					break;
				}
			}
			
			
			//Q5
			for(int x = 1; x <= 10; x++) {
				for(int y = 1; y <= 10; y++) {
					if(4*x + 5*y == 60) {
						System.out.println("( " + x + ", " + y + " )");
					}
				}
		    }
			
			
			
			//Q6
			for(int i1 = 1; i1 <= 5; i1++) {   //i 줄번호라고 생각하기
				System.out.println();
				
			    for(int j = 1; j <= i; j++) {  // 줄번호랑 똑같은 갯수의 별 갯수
			    	System.out.println("*");
			    }
			}
			
		
				
				
		    //Q7
			Scanner scanner = new Scanner(System.in);
			boolean run = true;
		    int balance = 0;   //잔
		    
		    while(run) {
		    	System.out.println("--------------------");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.println("--------------------");
				System.out.println("선택> ");
				
				String strNum = scanner.nextLine();
				
				if(strNum.equals("1")){
					System.out.println("예금액> ");
				    int money = scanner.nextInt();
				    balance = balance + money;
					System.out.println("잔액> " + balance);
				}else if(strNum.equals("2")) {
					System.out.println("출금액> ");
					int money = scanner.nextInt();
			        balance = balance - money;		
					System.out.println("잔액> " + balance);
				}else if(strNum.equals("3")) {
					System.out.println("잔액> " + balance);
				}else if(strNum.equals("4")){
				    run = false;
				}
		    }
		    System.out.println("프로그램 종료");
		    
		    
		 
			
					
				}
		    }
	}
}
