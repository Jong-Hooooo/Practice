package ch01.sec08;

public class IfSwitch0417 {

	public static void main(String[] args) {
		// 조건문 if switch -> 조건에 맞는 값을 찾기 위해
		//제어문(조건식){
		//		참일때 결과값;
		//} else {
		//		거짓일때 결과값;
		//}
		//ex) if(score > 90){
		//		grade = 'A';
		//	  } else{
		//			거짓일때 결과값;
		//	  }
		//if조건문에 증가로 안해도 괜찮지만 if 조건문 안에 실행문이 여러개일때 중가로가 없다면 하나만 실행된다. 그러므로 증가로 그냥 다 넣어버리기
		//if(조건식){
		//	실행문;
		//	실행문;
		//	실행문;
		//}				->if 조건문 안 실행문 3개가 다 실행됨
		//if(조건식)
		//	실행문;
		//	실행문;
		//	실행문;		->if 조건문 안 실행문 1개만 실행됨
		
		//score 값이 90 이상이면 점수가 90보다 큽니다. 등급은 'A'입니다. 를 출력
		int score = 90;
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		if(score > 90)
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 B입니다.");
		//if 조건문에 중가로가 없어서 점수가 90보다 큽니다가 출력되어야 하지만 밑에도 출력된다. syso();은 출력하라는 것이기 때문에 밑에는 if에 포함된게 아닌 그냥 출력된 것
			
		//score 값이 90이상이면 점수가 90보다 큽니다. 등급은 'A'입니다.
		//score 값이 90미만이면 점수가 90보다 작습니다. 등급은 'B'입니다.
		int score1 = 80;
		if (score1 >= 90){
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A 입니다.");
		}else {
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 B 입니다.");
		}
		//조건은 한개 결과값이 두개
		
		//점수 90 이상 A, 80이상 B, 70이상 C, 60이상 D, 나머지 F
		//조건은 한개 결과값이 다섯개
		//if 갯수 = 결과값 -1
		if(score1 >= 90) {
			System.out.println("등급은 A 입니다.");
		}else if(score1 >= 80) {
			System.out.println("등급은 B 입니다.");
		}else if(score1 >= 70) {
			System.out.println("등급은 C 입니다.");
		}else if(score1 >= 60) {
			System.out.println("등급은 D 입니다.");
		}else {
			System.out.println("등급은 F 입니다.");
		}
		//반드시 조건에 맞는 한개만 출력됨
		
		
		//랜덤값(난수) Math 이름의 클래스에 가면 random()이라고 하는 메소드 있다
		//int num = 랜덤값으로 뽑을 거다
		int num = (int)(Math.random() * 6) + 1;
		
		if(num == 1) {
			System.out.println("1번이 나왔습니다.");
		}else if(num == 2) {
			System.out.println("2번이 나왔습니다.");
		}else if(num == 3) {
			System.out.println("3번이 나왔습니다.");
		}else if(num == 4) {
			System.out.println("4번이 나왔습니다.");
		}else if(num == 5) {
			System.out.println("5번이 나왔습니다.");
		}else {
			System.out.println("6번이 나왔습니다.");
		}
		
		// 81~100점 랜덤 점수 95이상 A+, 90이상 A, 85이상 B+, 80이상 B
		int score2 = (int)(Math.random() * 20) + 81;
		System.out.println(score);
		
		String grade;
		
		if(score2 >= 90) {
			
			if(score2 >= 95) {
				grade = "A+";
			}else {
				grade = "A";
			}
		}else {
			if(score2 >= 85) {
				grade = "B+";
			}else {
				grade = "B";
			}
		}
		System.out.println(grade);
		
		
		
		//Switch
		int num1 = (int)(Math.random() *6) + 1;
		switch(num1) {
			case 1 :
				System.out.println("1번이 나왔습니다.");
				break;
			case 2 :
				System.out.println("2번이 나왔습니다.");
				break;
			case 3 :
				System.out.println("3번이 나왔습니다.");
				break;
			case 4 :
				System.out.println("4번이 나왔습니다.");
				break;
			case 5 :
				System.out.println("5번이 나왔습니다.");
				break;
			default :
				System.out.println("6번이 나왔습니다.");
			//break로 다음 case를 실행하지 않고 switch를 빠져나간다.
				
			int time = (int)(Math.random() *4) + 8;
			System.out.println(time);
			
			switch(time) {
				case 8 :
					System.out.println("출근합니다");
				case 9 :
					System.out.println("회의를 합니다");
				case 10 :
					System.out.println("업무를 봅니다");
				default :
					System.out.println("외근을 나갑니다");
			}
			//break가 없는 누적 출력
			
			char grade1 = 'B';
			
			switch(grade1) {
				case 'A' :
				case 'a' :
					System.out.println("우수 회원입니다.");
					break;
				case 'B' :
				case 'b' :
					System.out.println("일반 회원입니다.");
					break;
				default :
					System.out.println("손님입니다.");
			}	//자바 전 버전 문법
				//case 'A', 'a' -> {
					System.out.println("우수 회원입니다.");
				//}
				//case 'B', 'b' -> {
					System.out.println("일반 회원입니다.");
				//}
				//default -> {
					System.out.println("손님입니다.");
				//}
			//}
			//switch(grade1){
			//case 'A', 'a' -> System.out.println("우수 회원입니다.");
			//case 'B', 'b' -> System.out.println("일반 회원입니다.");
			//default -> System.out.println("손님입니다.");
			//위 두가 방법 중 더 편리한 방법으로 적용
					//자바 13부터 가능
					
					
		}
	}

}
