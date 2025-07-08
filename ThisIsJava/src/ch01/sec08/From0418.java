package ch01.sec08;

import java.util.Scanner;

public class From0418 {

	public static void main(String[] args) {
		// if switch 조건문 조건에 맞는 식을 검색하고 원하는 데이터를 출력할때 사용
		// for(반복되는 횟수가 정해져 있을 때) while(횟수와 상관없이 조건이 true면 계속 반복하고 싶을 때) do~while
		//반복문 -> 같은 작업을 반복해야할때 
		
		int sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		
		//for(초기값 ; 조건식 ; 증감식){
		//   실행문;
		//}
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + " ");
		}
		
		int sum1 = 0;
		int i;
		
		for (i = 1; i <= 100; i++) {
			sum1 += i;
		}
		System.out.println("1~" + (i-1) + " 합 : " + sum1);
		
		//구구단 2단
		int m = 2;
		
		for(int n = 1; n <= 9; n++) {
			System.out.println(m * n);
			System.out.println(m + "*" + n + "=" + (m * n));
		}
		
		//구구단 2단 ~ 9단
		for(int m1 = 2; m1 <= 9; m1++) {
			
			for(int n = 1; n <= 9; n++) {
				System.out.println(m1 + "*" + n + "=" + (m1 * n));
			}
					
		}

		//while 문
		//while(조건식){
		//    실행문
		//}
	    int i1 = 1;  //while 문 안에는 초기식 x 밖에다 설정해줘야 함(없어도 되는 경우가 있기는 함->true, false)
	    while(i1 <= 10) {
	    	System.out.println(i1 + " ");
	    	i1++;    // 2 3 4 10 11
	    }
	    
	    int i2 = 1;
	    int sum2 = 0;
	    while(i2 <= 100) {
	    	sum2 = sum2 + i2;
	    	i2++;
	    }
		
	    System.out.println(sum2);
	    
	    //결과만 보고 만들어보기
	    //--------
	    //1.증속 2.감속 3.정지
	    //--------
	    //선택 
	    //키보드를 통해 선택값을 입력하게 Scanner
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
	    while(run) {
	       System.out.println("-----------------");
	       System.out.println("1.증속 2.감속 3.중지");
	       System.out.println("-----------------");
	       System.out.println("선택 : ");
	       
	       String strNum = scanner.nextLine();
	    
	    if(strNum.equals("1")) {
	    	speed++;
	    	System.out.println("현재속도 : " + speed);
	    }else if(strNum.equals("2")) {
	    	speed--;
	    	System.out.println("현재속도 : " + speed);
	    }else if(strNum.equals("3")) {
	    	run = false;
	    }
	    }
	    System.out.println("프로그램 종료");
	    
	    
	    
	    
	}

}
