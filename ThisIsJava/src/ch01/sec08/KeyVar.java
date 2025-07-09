package ch01.sec08;

import java.util.Scanner;

public class KeyVar {

	public static void main(String[] args) {
		// 키보드 입력 데이터를 변수에 저장
		Scanner scanner = new Scanner(System.in);	//콘솔 창에 키보드를 통해 입력하기 위해 설정
		
		System.out.println("X값 입력: ");
		
		String strX = scanner.nextLine();			//콘솔 창에 키보드를 통해 입력한 값을 입력한 뒤 Enter -> 무조건 문자 취급!
		
		System.out.println(strX + 10);				//strX 5	510
		
		int x = Integer.parseInt(strX);				//x 5
		//문자 x를 숫자 x로 변경
		
		System.out.println(x + 10);					//5 + 10	15
		
		System.out.println("Y값 입력: ");
		String strY = scanner.nextLine();
		System.out.println(strY);
		int y = Integer.parseInt(strY);
		//문자 y를 숫자 y로 변경
		System.out.println(y);
		
		
		int result = x + y;
		System.out.println("x + y: " + result);
		System.out.println(result);
		
		while(true) {								//While : 조건의 true면 계속 반복(반복문)
			System.out.println("입력 문자열: ");
			String data = scanner.nextLine();
			if(data.equals("q")) {					//equals : '참조타입'의 변수가 가지고 있는 값이 같냐고 물어볼때		// == : '기본타입'의 변수가 가지고 있는 값이 같냐고 물어볼때
				break;								//if문이 속해 있는 '반복문'을 빠져나감 (종료)
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		System.out.println("종료");
	}

}
