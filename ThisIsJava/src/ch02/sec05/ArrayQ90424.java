package ch02.sec05;

import java.util.Scanner;

public class ArrayQ90424 {

	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
//		int 
//		
//		boolean run = true;
//		while (run) {
//			System.out.println("---------------------------------------------");
//			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
//			System.out.println("---------------------------------------------");
//			System.out.println("선택> " );
//			
//			String strNum = scanner.nextLine();
//			
//			if(strNum.equals("1")) {
//				System.out.println("학생수> ");
//				String num = scanner.nextLine();
//				int num1 = Integer.parseInt(num);
//			}
//		}
//		
//		
//		System.out.println("학생수> " );
//		String strNum = scanner.nextLine();
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true;		//	while문 실행하기 위해서
		int count;	//키보드로 입력한 학생수
		int[] score = null;		//학생 점수가 입력 될 배열
		//int[] = score;
		//score = new int[5];
		
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.println("선택> " );
			String num = scanner.nextLine();
			
			if(num.equals("1")) {
				System.out.println("학생수> ");
				count = scanner.nextInt();
				scanner.nextLine();		//if 문이 두번 반복되는 것을 막아줌
				score = new int[count];
//				System.out.println("내가 만들 배열의 길이: " + score.length);		//배열 잘 만들어지고 있는지 확인
				
			}else if(num.equals("2")) {//잘 실행되고 있는지 확인
				
				for(int i = 0; i < score.length; i++) {
					System.out.println("score[" + i + "]: ");
					score[i] = scanner.nextInt();		
					scanner.nextLine();		//if 문이 두번 반복되는 것을 막아줌
				}
			}else if(num.equals("3")) {
				
				for(int i = 0; i < score.length; i++) {
					System.out.println("score[" + i + "]: " + score[i]);
				}
			}else if(num.equals("4")) {
				int max = 0;
				for(int maxNum : score) {
					if(max < maxNum) {
						max = maxNum;
					}
				}
			System.out.println("최고값: " + max);
			int sum = 0;
			for(int scores : score) {
				sum = sum + scores;
			}
			double avg = (double) sum / score.length;
			System.out.println("평균점수: " + avg);
			}else if(num.equals("5")) {		//다른 숫자 잘못 입력했을때 프로그램 종료가 안되기 위해서 숫자 5를 입력했을때만 종료하기 위해 else가 아닌 else if로 5만 입력하면 프로그램 종료되게끔 한다
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
		
		
	}

}
